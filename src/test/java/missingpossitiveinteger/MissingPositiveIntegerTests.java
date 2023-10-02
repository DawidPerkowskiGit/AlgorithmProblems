package missingpossitiveinteger;

import org.example.missingpositiveinteger.MissingPositiveIntegerInArray;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
public class MissingPositiveIntegerTests {

    MissingPositiveIntegerInArray alg = new MissingPositiveIntegerInArray();

    @Test
    public void shouldCorrectlySort() {
        int[] nums = {1,-1,-5,-3,3,4,2,8};
        int[] sorted = {1, 8, 2, 4, 3, -3, -5, -1};

        int counter = alg.sort(nums);

        assertEquals(true, Arrays.equals(sorted, nums));
        assertEquals(true, counter == 5);
    }

    @Test
    public void shouldCorrectlySort2() {
        int[] nums = {-1, 1};
        int[] sorted = {1, -1};

        int counter = alg.sort(nums);

        alg.sort(nums);

        assertEquals(true, Arrays.equals(sorted, nums));
        assertEquals(true, counter == 1);
    }

    @Test
    public void shouldReturnValidAnswer() {
        int[] nums = {1,-1,-5,-3,3,4,2,8};
        int correctNumber = 5;

        assertEquals(true, alg.find(nums) == correctNumber);
    }

    @Test
    public void shouldReturnValidAnswer2() {
        int[] nums = {-1, 1};
        int correctNumber = 2;

        assertEquals(true, alg.find(nums) == correctNumber);
    }

    @Test
    public void shouldReturnValidAnswer3() {
        int[] nums = {0,-1,-5,-3,3,4,2,8};
        int correctNumber = 1;

        assertEquals(true, alg.find(nums) == correctNumber);
    }

    @Test
    public void shouldReturnValidAnswer4() {
        int[] nums = {1,-1,0,-3,3,4,2,8};
        int correctNumber = 5;

        assertEquals(true, alg.find(nums) == correctNumber);
    }

    @Test
    public void shouldReturnValidAnswer5() {
        int[] nums = {1,1,1,2,1,1,1,1};
        int correctNumber = 3;

        assertEquals(true, alg.find(nums) == correctNumber);
    }

    @Test
    public void shouldReturnValidAnswer6() {
        int[] nums = {2, 0, 3, 4, 1};
        int correctNumber = 5;

        assertEquals(true, alg.find(nums) == correctNumber);
    }
}
