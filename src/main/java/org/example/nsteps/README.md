# N-steps problem
* [Problem](#problem)
* [Solution](#solution)

## Problem
There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

    1, 1, 1, 1
    2, 1, 1
    1, 2, 1
    1, 1, 2
    2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.

## Solution

I solved this problem using recursion. First algorithm checks if the data is correct, then it sorts the step amount list from lowest to highest.
Algorithm takes current number of steps taken, number of steps to be taken and current steps amount history.
There are only three outcomes of climbing the stairs in the next step.

```
#1 If we didn't reach the top continue climbing for every possible steps amount(#2, #3)
#2 If we overshoot (current stairs count + stairs to be climbed > total stairs) stop the algorithm
#3 If we reach the top, save current steps taken history.
```
