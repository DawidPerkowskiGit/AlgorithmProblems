package pangramchecker;

import org.example.pangramchecker.PangramChecker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PangramCheckerTests {
    @Test
    public void shouldReturnTrue() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void shouldReturnFalse() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram2));
    }
}
