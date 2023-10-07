package returnpairelement;

import org.example.returnpairelement.cons;
import org.junit.Test;
import org.example.returnpairelement.ReturnPairElement;

import static org.example.returnpairelement.ReturnPairElement.car;
import static org.example.returnpairelement.ReturnPairElement.cdr;
import static org.junit.Assert.assertEquals;

public class ReturnPairElementTests {

    @Test
    public void shouldReturnValidElementOfPair() {
        assertEquals(true,  car(new cons("4", "3")).equals("4"));
        assertEquals(true,  cdr(new cons("4", "3")).equals("3"));
    }
}
