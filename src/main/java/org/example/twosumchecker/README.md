# 2-Sum checker
* [Problem](#problem)
* [Solution](#solution)

## Problem
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
## Solution

Algorithm uses Maps to store numbers. HashMap can look for the specific item in O(1) time.
Algorithm iterates over numbers list and the number which completes the sum is equal to "sum - current number". 
It checks if the required number is in the list, returns true if positive. If not it adds current number to the list and continues with next one.



