package org.example.parityoutlier;

import java.util.List;

/**
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 * Examples
 *
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 *
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 */
public class ParityOutlier {
    public int find(int[] integers) {
        if (integers.length < 3) {
            return 0;
        }

        int oddCount = 0;
        int evenCount = 0;

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0 ; i < integers.length ; i++) {
            if (integers[i] % 2 == 1 || integers[i] % 2 == -1) {
                oddCount++;
                oddIndex = i;
            }
            else {
                evenCount++;
                evenIndex = i;
            }

            if (oddCount > 0 && evenCount > 0) {
                if (oddCount > 1) {
                    return integers[evenIndex];
                }
                if (evenCount > 1) {
                    return integers[oddIndex];
                }
            }
        }
        return 0;
    }
}
