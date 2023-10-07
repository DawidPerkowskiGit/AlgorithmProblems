# Return element of a pair
* [Problem](#problem)
* [Solution](#solution)

## Problem
cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

## Solution
The problem was defined in Python, so the implementation is different in Java. The solution uses class constructor to create pair and static methods cdr and car can be called on this pair to fetch first and second element.