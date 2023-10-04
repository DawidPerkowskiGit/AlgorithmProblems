package org.example.duplicateencoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public String encode(String word){
        Map<String, Boolean> letters = new HashMap<>();

        word = word.toLowerCase();

        String singleLetter = new String();
        for (int i = 0 ; i < word.length() ; i++) {
            singleLetter = String.valueOf(word.charAt(i));
            if (letters.containsKey(singleLetter.toString())) {
                letters.put(singleLetter.toString(), true);
            }
            else {
                letters.put(singleLetter.toString(), false);
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

