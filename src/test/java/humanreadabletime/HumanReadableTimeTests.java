package humanreadabletime;

import org.example.humanreadabletime.HumanReadableTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimeTests {
    private HumanReadableTime timeConverter = new HumanReadableTime();

    @Test
    public void shouldReturnValidTime() {
        int seconds = 0;
        String readableTime = "00:00:00";
        String convertedTime = timeConverter.makeReadable(seconds);

        assertEquals(true, convertedTime.equals(readableTime));
    }
    @Test
    public void shouldReturnValidTime2() {
        int seconds = 5;
        String readableTime = "00:00:05";
        String convertedTime = timeConverter.makeReadable(seconds);

        assertEquals(true, timeConverter.makeReadable(seconds).equals(readableTime));
    }

    @Test
    public void shouldReturnValidTime3() {
        int seconds = 60;
        String readableTime = "00:01:00";
        String convertedTime = timeConverter.makeReadable(seconds);

        assertEquals(true, convertedTime.equals(readableTime));
    }

    @Test
    public void shouldReturnValidTime4() {
        int seconds = 86399;
        String readableTime = "23:59:59";
        String convertedTime = timeConverter.makeReadable(seconds);

        assertEquals(true, convertedTime.equals(readableTime));
    }

    @Test
    public void shouldReturnValidTime5() {
        int seconds = 359999;
        String readableTime = "99:59:59";
        String convertedTime = timeConverter.makeReadable(seconds);

        assertEquals(true, convertedTime.equals(readableTime));
    }
}
