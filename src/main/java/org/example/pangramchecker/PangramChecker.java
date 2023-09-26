package org.example.pangramchecker;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    /**
     * My solution for pangram checker. I use Maps to store true/false information about each letter usage in sentence.
     * First algorithm puts to HashMap each letter from the alphabet as a key and false as a value
     * Secondly we iterate over input sentence letter by letter and put change corresponding value in the HashMap to true
     * At last we iterate over the HashMap, if we find at least one false value, result of pangram checker is false, otherwise it's true
     *
     * Cons :
     * - Lengthy implementation
     * - Not optimal
     *
     * Pros :
     * - Can implement for any alphabet or sign combination
     *
     * @param sentence input sentence
     * @return result of pangram checking
     */
    public boolean check(String sentence){
        final String[] englishLetters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Map<String, Boolean> letterExistsMap = new HashMap<>();

        sentence = sentence.toLowerCase();


        for(String letter: englishLetters) {
            letterExistsMap.put(letter, false);
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (letterExistsMap.containsKey(String.valueOf(sentence.charAt(i)))) {
                letterExistsMap.put(String.valueOf(sentence.charAt(i)), true);
            }
        }

        for (Map.Entry<String, Boolean> entry: letterExistsMap.entrySet()
             ) {
            if (entry.getValue().equals(false)) {
                return false;
            }
        }

        return true;
    }
}
