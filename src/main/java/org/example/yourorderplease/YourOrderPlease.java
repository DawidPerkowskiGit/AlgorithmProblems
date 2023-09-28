package org.example.yourorderplease;

import java.util.LinkedList;
import java.util.List;

/**
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
 *
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 *
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 * Examples
 *
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 */
public class YourOrderPlease {

/*    public int extractNumberFromString(String input) {

        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0 ; i < input.length() ; i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                if (leftIndex == 0) {
                    leftIndex = i;
                }
                else {
                    rightIndex = i;
                }
            }
        }
        return Integer.parseInt(input.substring(leftIndex, rightIndex + 1));
    }*/

    public int extractNumberFromString(String input) {

        for (int i = 0 ; i < input.length() ; i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                return Integer.parseInt(input.substring(i, i + 1));
            }
        }
        return 0;
    }

    public String order(String words) {
        if (words.equals("")) {
            return "";
        }

        String[] separateWords = words.split(" ");

        String[] sortedWords = new String[separateWords.length];

        for (String word: separateWords
             ) {
            int number = extractNumberFromString(word);
            sortedWords[number - 1] = word;
        }

        String output = "";

        for (int i = 0 ; i < sortedWords.length ; i++) {
            output += sortedWords[i];
            if (i < sortedWords.length - 1) {
                output += " ";
            }
        }

        return output;
    }

}
