package za.co.imgn.apical
import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.model.Intent
import com.amazon.ask.model.IntentRequest
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.Response
import com.amazon.ask.model.ui.SimpleCard
import com.amazon.ask.model.ui.SsmlOutputSpeech
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class HelpIntentHandlerSpec extends Specification {

    @Inject
    private HelpIntentHandler handler

    void "test HelpIntentHandler"() {
        when:
        HandlerInput input = HandlerInput.builder()
                .withRequestEnvelope(RequestEnvelope.builder()
                        .withRequest(IntentRequest.builder()
                                .withIntent(Intent.builder()
                                        .withName("AMAZON.HelpIntent")
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
        Response response = responseOptional.get();

        then:
        response.outputSpeech instanceof SsmlOutputSpeech

        when:
        String speechText = "You can say hello to me!"
        String expectedSsml = "<speak>${speechText}</speak>".toString()

        then:
        expectedSsml == ((SsmlOutputSpeech) response.outputSpeech).ssml
        response.reprompt.outputSpeech
        response.reprompt.outputSpeech instanceof SsmlOutputSpeech
        expectedSsml == ((SsmlOutputSpeech) response.reprompt.outputSpeech).ssml
        response.getCard() instanceof SimpleCard
        "HelloWorld" == ((SimpleCard) response.card).title
        speechText == ((SimpleCard) response.card).content
        !response.shouldEndSession
    }
}
