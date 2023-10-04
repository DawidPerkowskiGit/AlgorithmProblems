package duplicateencoder;

import org.example.duplicateencoder.DuplicateEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuplicateEncoderTests {

    @Test
    public void shouldReturnCorrectlyEncodedMessage() {
        String input = "recede";
        String output = "()()()";
        DuplicateEncoder duplicateEncoder = new DuplicateEncoder();

        assertEquals(true, output.equals(duplicateEncoder.encode(input)));
    }

    @Test
    public void shouldReturnCorrectlyEncodedMessage2() {
        String input = "Prespecialized";
        String output = ")()())()(()()(";
        DuplicateEncoder duplicateEncoder = new DuplicateEncoder();

        assertEquals(true, output.equals(duplicateEncoder.encode(input)));
    }

    @Test
    public void shouldReturnCorrectlyEncodedMessage3() {
        String input = "   ()(   ";
        String output = "))))())))";
        DuplicateEncoder duplicateEncoder = new DuplicateEncoder();

        assertEquals(true, output.equals(duplicateEncoder.encode(input)));
    }
}
