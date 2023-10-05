package tenminwalk;

import org.example.tenminwalk.TenMinWalk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenMinWalkTests {

    private TenMinWalk tenMinWalk = new TenMinWalk();

    @Test
    public void shouldReturnTrue() {
        char[] path = {'n','s','n','s','n','s','n','s','n','s'};

        assertEquals(true, tenMinWalk.isValid(path));
    }

    @Test
    public void shouldReturnFalse() {
        char[] path = {'w','e','w','e','w','e','w','e','w','e','w','e'};

        assertEquals(false, tenMinWalk.isValid(path));
    }

    @Test
    public void shouldReturnFalse2() {
        char[] path = {'w'};

        assertEquals(false, tenMinWalk.isValid(path));
    }

    @Test
    public void shouldReturnFalse3() {
        char[] path = {'n','n','n','s','n','s','n','s','n','s'};

        assertEquals(false, tenMinWalk.isValid(path));
    }
}
