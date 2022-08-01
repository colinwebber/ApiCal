package za.co.imgn.apical
import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.model.Intent
import com.amazon.ask.model.IntentRequest
import com.amazon.ask.model.RequestEnvelope
import com.amazon.ask.model.Response
import com.amazon.ask.model.ui.SimpleCard
import com.amazon.ask.model.ui.SsmlOutputSpeech
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class CancelIntentHandlerSpec extends Specification {

    @Inject
    private CancelIntentHandler handler;

    void testCancelIntentHandler() {
        when:
        HandlerInput input = HandlerInput.builder()
                .withRequestEnvelope(RequestEnvelope.builder()
                        .withRequest(IntentRequest.builder()
                                .withIntent(Intent.builder()
                                        .withName("AMAZON.CancelIntent")
                                        .build())
                                .build())
                        .build()
                ).build()

        then:
        handler.canHandle(input)

        when:
        Optional<Response> responseOptional = handler.handle(input)

        then:
        responseOptional.isPresent()

        when:
        Response response = responseOptional.get()

        then:
        response.getOutputSpeech() instanceof SsmlOutputSpeech
        "<speak>Goodbye</speak>" == ((SsmlOutputSpeech) response.outputSpeech).ssml
        response.getCard() instanceof SimpleCard
        "HelloWorld" == ((SimpleCard) response.card).title
        "Goodbye" == ((SimpleCard) response.card).content
        response.shouldEndSession
    }
}
