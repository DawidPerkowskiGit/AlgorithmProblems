package messagedecoder;

import org.example.messagedecoder.MessageDecoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageDecoderTests {
    private MessageDecoder decoder = new MessageDecoder();

    @Test
    public void shouldReturnValidAnswer() {
        String message = "111";
        int validAnswer = 3;

        assertEquals(true, decoder.decode(message) == validAnswer);
    }

    @Test
    public void shouldReturnValidAnswer2() {
        String message = "121";
        int validAnswer = 3;

        assertEquals(true, decoder.decode(message) == validAnswer);
    }

    @Test
    public void shouldReturnValidAnswer3() {
        String message = "1234";
        int validAnswer = 3;

        assertEquals(true, decoder.decode(message) == validAnswer);
    }

    @Test
    public void shouldReturnValidAnswer4() {
        String message = "73281";
        int validAnswer = 1;

        assertEquals(true, decoder.decode(message) == validAnswer);
    }
}
