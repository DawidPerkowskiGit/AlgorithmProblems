# Largest non-adjacent sum
* [Problem](#problem)
* [Solution](#solution)

## Problem
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?

## Solution

This solution relies on keeping track of two values, the biggest sum of an adjacent value and non-adjacent values, and the second biggest sum of non-adjacent element.
In each iteration algorithm checks which value is bigger, current value plus sum of adjacent elements (second biggest sum), or sum of an adjacent element and non-adjacent elements (first biggest sum).
Biggest of these two values becomes "first sum" and the "second sum" is equal to previous "first sum" value. Algorithm returns first sum.

This solution passes through input array once, so time complexity is O(n).