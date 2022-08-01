package za.co.imgn.apical
import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.model.RequestEnvelope
import com.amazon.ask.model.Response
import com.amazon.ask.model.ui.SimpleCard
import com.amazon.ask.model.ui.SsmlOutputSpeech
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
public class LaunchRequestIntentHandlerSpec extends Specification {

    @Inject
    LaunchRequestIntentHandler handler

    void "test launch request intent handler"() {
        given:
        LaunchRequest request = LaunchRequest.builder().build()
        HandlerInput input = HandlerInput.builder()
                .withRequestEnvelope(RequestEnvelope.builder()
                        .withRequest(request)
                        .build()
                ).build()
        expect:
        handler.canHandle(input)

        when:
        Optional<Response> responseOptional = handler.handle(input)

        then:
        responseOptional.isPresent()

        when:
        Response response = responseOptional.get()

        then:
        response.getOutputSpeech() instanceof SsmlOutputSpeech

        when:
        String speechText = "Welcome to the Alexa Skills Kit, you can say hello"
        String expectedSsml = "<speak>${speechText}</speak>".toString()

        then:
        expectedSsml == ((SsmlOutputSpeech) response.outputSpeech).ssml
        response.reprompt
        response.reprompt.outputSpeech
        response.reprompt.outputSpeech instanceof SsmlOutputSpeech
        expectedSsml == ((SsmlOutputSpeech) response.reprompt.outputSpeech).ssml
        response.card instanceof SimpleCard
        "HelloWorld" == ((SimpleCard) response.card).title
        speechText == ((SimpleCard) response.card).content
        !response.shouldEndSession
    }
}
