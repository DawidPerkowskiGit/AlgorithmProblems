package parityoutlier;

import org.example.pangramchecker.PangramChecker;
import org.example.parityoutlier.ParityOutlier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
public class ParityOutlierTests {

    ParityOutlier parityOutlier = new ParityOutlier();
    @Test
    public void shouldReturnTrue() {
        int[] list = {2, 4, 0, 100, 4, 11, 2602, 36};
        int outlier = 11;

        assertTrue(parityOutlier.find(list) == outlier);
    }

    @Test
    public void shouldReturnTrue2() {
        int[] list = {1, -3, -5, 7, 160, 3, 1719, 19, 11, 13, -21};
        int outlier = 160;

        assertTrue(parityOutlier.find(list) == outlier);
    }
    @Test
    public void shouldReturnTrue3() {
        int[] list = {2, 6, 8, -10, 3};
        int outlier = 3;

        assertTrue(parityOutlier.find(list) == outlier);
    }

    @Test
    public void shouldReturnTrue4() {
        int[] list = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int outlier = 206847684;

        assertTrue(parityOutlier.find(list) == outlier);
    }

    @Test
    public void shouldReturnTrue5() {
        int[] list = {Integer.MAX_VALUE, 0, 1};
        int outlier = 0;

        assertTrue(parityOutlier.find(list) == outlier);
    }
}
