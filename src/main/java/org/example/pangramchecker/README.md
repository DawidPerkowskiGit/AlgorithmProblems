# Pangram Checker
* [Problem](#problem)
* [Solution](#solution)

## Problem
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

## Solution

Maps are used to store true/false information about each letter usage in sentence.

- Firstly algorithm puts in the HashMap each letter from the alphabet as a key and false as a value
- Secondly it iterates over input sentence letter by letter and puts true as a value to corresponding letter
- Lastly it iterates over the HashMap, if it finds at least one false value, result of pangram checker is false, otherwise it's true
  
Pros :
- Can implement for any alphabet or other sign combination


Cons :
- Lengthy implementation
- Not optimal


