# N-steps problem
* [Problem](#problem)
* [Solution](#solution)

## Problem
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

## Solution

My solution for pangram checker. I use Maps to store true/false information about each letter usage in sentence.

- Firstly algorithm puts to HashMap each letter from the alphabet as a key and false as a value
- Secondly we iterate over input sentence letter by letter and put change corresponding value in the HashMap to true
- Lastly we iterate over the HashMap, if we find at least one false value, result of pangram checker is false, otherwise it's true

Cons :
- Lengthy implementation
- Not optimal

Pros :
- Can implement for any alphabet or other sign combination


