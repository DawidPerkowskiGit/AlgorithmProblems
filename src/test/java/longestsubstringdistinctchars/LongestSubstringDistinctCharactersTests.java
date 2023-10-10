package longestsubstringdistinctchars;

import org.example.longestsubstringdistinctchars.LongestSubstringDistinctCharacters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringDistinctCharactersTests {


    @Test
    public void shouldReturnValidCount() {
        String input = "abcba";
        int distinctChars = 2;
        int validAnswer = 3;
        LongestSubstringDistinctCharacters algorithm = new LongestSubstringDistinctCharacters(distinctChars, input);

        int answer = algorithm.find();

        assertEquals(true, validAnswer == answer);
    }

    @Test
    public void shouldReturnValidCount2() {
        String input = "abcba";
        int distinctChars = 3;
        int validAnswer = 5;
        LongestSubstringDistinctCharacters algorithm = new LongestSubstringDistinctCharacters(distinctChars, input);

        int answer = algorithm.find();

        assertEquals(true, validAnswer == answer);
    }

    @Test
    public void shouldReturnValidCount3() {
        String input = "fghijklzabcbazxy";
        int distinctChars = 4;
        int validAnswer = 7;
        LongestSubstringDistinctCharacters algorithm = new LongestSubstringDistinctCharacters(distinctChars, input);

        int answer = algorithm.find();
        assertEquals(true, validAnswer == answer);
    }
}
