package yourorderplease;

import org.example.yourorderplease.YourOrderPlease;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class YourOrderPleaseTests {

    YourOrderPlease yourOrderPlease = new YourOrderPlease();

    @Test
    public void shouldReturnValidNumberFromString() {
        String string = "Ap1ollo";
        int number = 1;

        assertEquals(true, yourOrderPlease.extractNumberFromString(string) == number);
    }

    @Test
    public void shouldReturnValidNumberFromString2() {
        String string = "3ollo";
        int number = 3;

        assertEquals(true, yourOrderPlease.extractNumberFromString(string) == number);
    }

    @Test
    public void shouldReturnValidNumberFromString3() {
        String string = "1Apollo";
        int number = 1;

        assertEquals(true, yourOrderPlease.extractNumberFromString(string) == number);
    }

    @Test
    public void shouldReturnValidNumberFromString4() {
        String string = "Apollo3";
        int number = 3;

        assertEquals(true, yourOrderPlease.extractNumberFromString(string) == number);
    }

    @Test
    public void shouldReturnSortedString() {
        String unsorted = "is2 Thi1s T4est 3a";
        String sorted = "Thi1s is2 3a T4est";

        assertEquals(true, sorted.equals(yourOrderPlease.order(unsorted)));
    }

    @Test
    public void shouldReturnSortedString2() {
        String unsorted = "4of Fo1r pe6ople g3ood th5e the2";
        String sorted = "Fo1r the2 g3ood 4of th5e pe6ople";

        assertEquals(true, sorted.equals(yourOrderPlease.order(unsorted)));
    }

    @Test
    public void shouldReturnSortedString3() {
        String unsorted = "";
        String sorted = "";

        assertEquals(true, sorted.equals(yourOrderPlease.order(unsorted)));
    }

}
