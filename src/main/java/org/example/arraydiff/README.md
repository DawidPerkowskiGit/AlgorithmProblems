# Array Diff
* [Problem](#problem)
* [Solution](#solution)

## Problem
Your goal is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}

If a value is present in b, all of its occurrences must be removed from the other:

arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[]

## Solution

Solution uses Java's List function removeAll to remove entires from Array A.
