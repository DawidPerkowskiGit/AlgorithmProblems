package org.example.largestnonadjacentsum;

public class LargestNonAdjacentSum {
    public int findSum(int[] numbers) {

        int adjacentBiggest = 0;
        int nonAdjacentBiggest = 0;
        int tempSum = 0;
        for (int i = 0 ; i < numbers.length ; i++) {
            tempSum = Math.max(numbers[i] + nonAdjacentBiggest, adjacentBiggest);
            nonAdjacentBiggest = adjacentBiggest;
            adjacentBiggest = tempSum;
        }

        return adjacentBiggest;
    }
}
