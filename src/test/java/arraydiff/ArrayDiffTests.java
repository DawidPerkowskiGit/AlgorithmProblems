package arraydiff;

import org.example.arraydiff.ArrayDiff;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class ArrayDiffTests {

    ArrayDiff arrayDiff = new ArrayDiff();
    @Test
    public void shouldReturnCorrectArray() {
        int[] arrayA = {1, 2, 2, 2, 3};

        int[] arrayB = {2};

        int[] correctArray = {1, 3};
        assertEquals(true, Arrays.equals(Arrays.stream(arrayDiff.removeElements(arrayA, arrayB)).toArray(), Arrays.stream(correctArray).toArray()));
    }

    @Test
    public void shouldReturnCorrectArray2() {
        int[] arrayA = {1, 7, 4, 2, 6};

        int[] arrayB = {2, 1, 8};

        int[] correctArray = {7, 4, 6};
        assertEquals(true, Arrays.equals(Arrays.stream(arrayDiff.removeElements(arrayA, arrayB)).toArray(), Arrays.stream(correctArray).toArray()));
    }
}
