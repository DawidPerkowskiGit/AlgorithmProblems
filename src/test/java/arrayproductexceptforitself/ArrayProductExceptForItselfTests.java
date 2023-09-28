package arrayproductexceptforitself;

import org.example.arrayproductexceptforitself.ArrayProductExceptForItself;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class ArrayProductExceptForItselfTests {

    @Test
    public void shouldReturnValidArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = {120, 60, 40, 30, 24};

        ArrayProductExceptForItself arrayProductExceptForItself = new ArrayProductExceptForItself();

        assertEquals(true, Arrays.equals(output, arrayProductExceptForItself.calculate(input)));
    }

    @Test
    public void shouldReturnValidArray2() {
        int[] input = {6, 4, 2};
        int[] output = {8, 12, 24};

        ArrayProductExceptForItself arrayProductExceptForItself = new ArrayProductExceptForItself();

        assertEquals(true, Arrays.equals(output, arrayProductExceptForItself.calculate(input)));
    }

    @Test
    public void shouldReturnInvalidArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = {120, 60, 40, 30, 23};

        ArrayProductExceptForItself arrayProductExceptForItself = new ArrayProductExceptForItself();

        assertEquals(false, Arrays.equals(output, arrayProductExceptForItself.calculate(input)));
    }
}
