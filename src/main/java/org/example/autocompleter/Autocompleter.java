package org.example.autocompleter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Autocompleter {

    private Dictionary dictionary = new Dictionary();

    public Autocompleter() {
        dictionary.fillDict();
        dictionary.sort();
    }

    public String[] autocomplete(String word) {

        word = word.toLowerCase();

        List<String> returnedWords = new LinkedList<>();
        for (String wordInDict: this.dictionary.dictionary[word.charAt(0) - 97]
             ) {
            if (wordInDict.startsWith(word)) {
                returnedWords.add(wordInDict);
            }
        }
        return Arrays.copyOf(returnedWords.toArray(), returnedWords.size(), String[].class);
    }
}
