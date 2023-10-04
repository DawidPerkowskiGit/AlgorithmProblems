# Unival tree counter
* [Problem](#problem)
* [Solution](#solution)

## Problem
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
Examples
```
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
```

## Solution
Algorithm passes through input word twice, first time it puts to a HashMap information about current letter, if the letter does not exist in the Map it is inserted with value False, if it exists in the map it is put (exchanged) with value True.
Second pass of the input word encodes it based on if the current letter has a value true or false in the HashMap.