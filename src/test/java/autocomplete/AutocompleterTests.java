package autocomplete;

import org.example.autocompleter.Autocompleter;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AutocompleterTests {

    private Autocompleter autocompleter = new Autocompleter();

    @Test
    public void shouldReturnCorrectWords() {
        String phrase = "ab";
        String[] words = {"above", "about", "able", "abundance"};
        String[] returnedWords = autocompleter.autocomplete(phrase);

        assertEquals(true, Arrays.stream(words).toList().containsAll(Arrays.stream(returnedWords).toList()) && Arrays.stream(returnedWords).toList().containsAll(Arrays.stream(words).toList()));
    }

    @Test
    public void shouldReturnCorrectWords2() {
        String phrase = "ac";
        String[] words = {"account", "across"};
        String[] returnedWords = autocompleter.autocomplete(phrase);

        assertEquals(true, Arrays.stream(words).toList().containsAll(Arrays.stream(returnedWords).toList()) && Arrays.stream(returnedWords).toList().containsAll(Arrays.stream(words).toList()));
    }

    @Test
    public void shouldReturnIncorrectWords3() {
        String phrase = "z";
        String[] words = {"zip", "zero", "zap", "z"};
        String[] returnedWords = autocompleter.autocomplete(phrase);

        assertEquals(true, Arrays.stream(words).toList().containsAll(Arrays.stream(returnedWords).toList()) && Arrays.stream(returnedWords).toList().containsAll(Arrays.stream(words).toList()));
    }

    @Test
    public void shouldReturnCorrectWords3() {
        String phrase = "z";
        String[] words = {"zip", "zero", "zap", "z", "incorrect"};
        String[] returnedWords = autocompleter.autocomplete(phrase);

        assertEquals(false, Arrays.stream(words).toList().containsAll(Arrays.stream(returnedWords).toList()) && Arrays.stream(returnedWords).toList().containsAll(Arrays.stream(words).toList()));
    }
}
