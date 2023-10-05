package org.example.duplicateencoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public String encode(String word){
        Map<String, Boolean> letters = new HashMap<>();

        word = word.toLowerCase();

        String singleLetter;
        for (int i = 0 ; i < word.length() ; i++) {
            singleLetter = String.valueOf(word.charAt(i));
            if (letters.containsKey(singleLetter)) {
                letters.put(singleLetter, true);
            }
            else {
                letters.put(singleLetter, false);
            }
        }

        StringBuilder encodedWord = new StringBuilder();
        for (int i = 0 ; i < word.length() ; i++) {
            singleLetter = String.valueOf(word.charAt(i));
            if (letters.get(singleLetter)) {
                encodedWord.append(")");
            }
            else {
                encodedWord.append("(");
            }
        }

        return encodedWord.toString();

    }
}

