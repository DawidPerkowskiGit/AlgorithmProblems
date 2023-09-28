package twosumchecker;

import org.example.twosumchecker.TwoSumChecker;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TwoSumCheckerTests {
    @Test
    public void shouldReturnTrue() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);
        int sum = 17;

        TwoSumChecker twoSumChecker = new TwoSumChecker();

        assertEquals(true, twoSumChecker.checkTwoSum(numbers, sum));
    }

    @Test
    public void shouldReturnTrue2() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        int sum = 18;

        TwoSumChecker twoSumChecker = new TwoSumChecker();

        assertEquals(true, twoSumChecker.checkTwoSum(numbers, sum));
    }

    @Test
    public void shouldReturnFalse() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(3);
        numbers.add(6);
        int sum = 17;

        TwoSumChecker twoSumChecker = new TwoSumChecker();

        assertEquals(false, twoSumChecker.checkTwoSum(numbers, sum));
    }

    @Test
    public void shouldReturnFalse2() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        int sum = 19;

        TwoSumChecker twoSumChecker = new TwoSumChecker();

        assertEquals(false, twoSumChecker.checkTwoSum(numbers, sum));
    }
}
