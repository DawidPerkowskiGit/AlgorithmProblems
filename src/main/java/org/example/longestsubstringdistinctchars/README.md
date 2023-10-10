# Longest substring containing k distinct characters
* [Problem](#problem)
* [Solution](#solution)

## Problem
Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

## Solution
This algorithm passes input string once. It keeps in memory left and right index of current longest valid substring. Letters and numbers their count is stored in a HashMap.
When processing a letter it chooses one of scenarios:

#1 If the letter is not yet in Map:
#1a If the there are less distinct letters than maximum k - add this letter
#1b If adding this letter causes breaking the maximum k - go from the left index towards current position and remove a letter from the current substring. It stops when the current distinct letter counters is lower than maximum k.
#2 If the letter is already in the map - add it to substring.