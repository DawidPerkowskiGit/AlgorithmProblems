package org.example.messagedecoder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
 *
 * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 *
 * You can assume that the messages are decodable. For example, '001' is not allowed.
 */
public class MessageDecoder {

    final String[] englishLetters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    final Map<String, String> mappedLetters = new HashMap<>();

    final List<String> messages = new LinkedList<>();

    String message;
    int messageLength;

    private final boolean DEBUG = false;


    public MessageDecoder() {
        for (int i = 0; i < this.englishLetters.length ; i++) {
            mappedLetters.put(""+ (i + 1), englishLetters[i]);
        }
    }
    public int decode(String message) {
        this.message = message;
        this.messageLength = message.length();

        recursive("", 0);

        System.out.println(messages);

        return this.messages.size();

    }

    public void recursive(String currentDecodedMessage, int leftIndex) {

        for (int i = 1 ; i <= 2 ; i++) {
            if (leftIndex + i <= this.messageLength) {
                System.out.println("In for, currentMessage=" + currentDecodedMessage+ ", leftIndex = " + leftIndex + ", rightIndex = " + (leftIndex + i));
                if (this.mappedLetters.containsKey(this.message.substring(leftIndex ,leftIndex + i))) {
                    String newDecodedMessage = currentDecodedMessage;
                    newDecodedMessage+=this.mappedLetters.get(this.message.substring(leftIndex, leftIndex + i));
                    if (leftIndex + i + 1 <= this.messageLength) {
                        recursive(newDecodedMessage, leftIndex + i);
                    }
                    else {
                        System.out.println(newDecodedMessage);
                        this.messages.add(newDecodedMessage);
                    }
                }
            }
        }
    }

}
