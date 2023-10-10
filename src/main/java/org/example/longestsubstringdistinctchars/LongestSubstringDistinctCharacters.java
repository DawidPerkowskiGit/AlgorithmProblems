package org.example.longestsubstringdistinctchars;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringDistinctCharacters {

    Map<String, Integer> distinctChars = new HashMap<>();

    private int leftIndex = 0;

    private int currentDistinct = 0;

    private final int MAX_DISTINCT_CHARS;

    private final String INPUT;

    private int currentIndex = 0;

    private int currentMax = 0;

    private int currentCounter = 0;

    public LongestSubstringDistinctCharacters(int MAX_DISTINCT_CHARS, String INPUT) {
        this.MAX_DISTINCT_CHARS = MAX_DISTINCT_CHARS;
        this.INPUT = INPUT;
    }

    public int find() {
        while (this.currentIndex < this.INPUT.length())
            if (this.distinctChars.containsKey(String.valueOf(INPUT.charAt(currentIndex)))) {
                addChar();
            }
            else {
                if (this.currentDistinct >= this.MAX_DISTINCT_CHARS) {
                    removeChar();
                }
                else {
                    addChar();
                }
            }
        return Math.max(this.currentCounter, this.currentMax);
    }

    public void addChar() {
        if (this.distinctChars.containsKey(String.valueOf(INPUT.charAt(currentIndex)))) {
            this.distinctChars.put(String.valueOf(INPUT.charAt(currentIndex)), this.distinctChars.get(String.valueOf(INPUT.charAt(currentIndex))) + 1);
        }
        else {
            this.distinctChars.put(String.valueOf(INPUT.charAt(currentIndex)), 0);
            this.currentDistinct++;
        }

        this.currentCounter++;
        this.currentMax = Math.max(this.currentCounter, this.currentMax);

        this.currentIndex++;
    }

    public void removeChar() {
        while (this.currentDistinct >= this.MAX_DISTINCT_CHARS) {
            if (this.distinctChars.get(String.valueOf(INPUT.charAt(leftIndex))) -1 <= 0) {
                this.distinctChars.remove(String.valueOf(INPUT.charAt(leftIndex)));
                currentDistinct--;
            }
            else {
                this.distinctChars.put(String.valueOf(INPUT.charAt(currentIndex)), this.distinctChars.get(String.valueOf(INPUT.charAt(currentIndex))) - 1);
            }
            this.currentCounter--;
            this.leftIndex++;
        }
    }


}
