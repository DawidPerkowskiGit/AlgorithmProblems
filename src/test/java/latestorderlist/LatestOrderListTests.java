package latestorderlist;

import org.example.latestorderlist.LatestOrderList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LatestOrderListTests {

    private LatestOrderList latestOrderList = new LatestOrderList();

    @Test
    public void shouldReturnCorrectListElement() {
        latestOrderList.record(5);
        latestOrderList.record(2);
        latestOrderList.record(8);
        latestOrderList.record(1);
        latestOrderList.record(7);
        latestOrderList.record(3);

        assertEquals(latestOrderList.get_last(1), 3);
        assertEquals(latestOrderList.get_last(2), 7);
        assertEquals(latestOrderList.get_last(3), 1);
        assertEquals(latestOrderList.get_last(4), 8);
        assertEquals(latestOrderList.get_last(5), 2);
        assertEquals(latestOrderList.get_last(6), 5);
    }
}
