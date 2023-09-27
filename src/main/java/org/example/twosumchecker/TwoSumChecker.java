package org.example.twosumchecker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
public class TwoSumChecker {
    public Boolean checkTwoSum(List<Integer> numbers, int sum) {
        Map<Integer, Boolean> mapOfNumbers = new HashMap<>();

        int complementaryNumber;
        for (Integer number: numbers
             ) {
            complementaryNumber = sum - number;
            if (mapOfNumbers.containsKey(complementaryNumber)) {
                return true;
            }
            else {
                mapOfNumbers.put(number, false);
            }
        }
        return false;
    }
}
