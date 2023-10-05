package largestnonadjacentsum;

import org.example.largestnonadjacentsum.LargestNonAdjacentSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNonAdjacentSumTests {
    private LargestNonAdjacentSum algorithm = new LargestNonAdjacentSum();

    @Test
    public void shouldReturnCorrectSum() {
        int[] numbers = {2, 4, 6, 2, 5};
        int calculatedSum = algorithm.findSum(numbers);
        int largestSum = 13;

        assertEquals(true, calculatedSum == largestSum);
    }

    @Test
    public void shouldReturnCorrectSum2() {
        int[] numbers = {2, 4, 6, 2, 5, 7, 1, 8};
        int calculatedSum = algorithm.findSum(numbers);
        int largestSum = 23;

        assertEquals(true, calculatedSum == largestSum);
    }

    @Test
    public void shouldReturnCorrectSum3() {
        int[] numbers = {2, 9, 6, 2, 5};
        int calculatedSum = algorithm.findSum(numbers);
        int largestSum = 14;

        assertEquals(true, calculatedSum == largestSum);
    }

    @Test
    public void shouldReturnCorrectSum4() {
        int[] numbers = {10, 2, 9, 6, 2, 5};
        int calculatedSum = algorithm.findSum(numbers);
        int largestSum = 24;

        assertEquals(true, calculatedSum == largestSum);
    }
}
