package org.example.missingpositiveinteger;

/**
 * Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 *
 * You can modify the input array in-place.
 */
public class MissingPositiveIntegerInArray {
    public int find(int[] nums) {
        int count = this.sort(nums);

        int currentNumber;
        for (int i = 0 ; i < count ; i++) {
            currentNumber = nums[i];
            if (Math.abs(currentNumber) <= count) {
                if (nums[Math.abs(currentNumber) - 1] > 0) {
                    nums[Math.abs(currentNumber) - 1] = -nums[Math.abs(currentNumber) - 1];
                }
            }
        }
        for (int i = 0 ; i < count ; i++) {
            if (nums[i] > 0) {
                return i+1;
            }
        }
        return count+1;
    }

    /**
     * Puts non-positive numbers on the right side of array, while putting positive numbers on the left side
     * @param nums arrays of numbers to sort
     * @return positive numbers count
     */
    public int sort(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length -1 ;

        while (leftPointer <= rightPointer) {
            if (nums[leftPointer] < 1) {
                if (nums[rightPointer] > 0) {
                    int temp = nums[rightPointer];
                    nums[rightPointer] = nums[leftPointer];
                    nums[leftPointer] = temp;
                    leftPointer++;
                }
                rightPointer--;
            }
            else {
                leftPointer++;
            }
        }

        return leftPointer;
    }
}
