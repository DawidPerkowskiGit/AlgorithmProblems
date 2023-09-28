# Array product except for itself
* [Problem](#problem)
* [Solution](#solution)

## Problem
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
## Solution

I implemented two solutions.

### Using division
First implementation passes input array twice so time complexity is O(n). 
In the first pass algorithm multiplies all the numbers in the array and in the second pass divides total product by current number.

Pros:
- fast - time complexity of O(n)

Cons:
- if the every number in the output array is lower than int limit, algorithm may cause numeric overflow, because total product may reach int numeric limit.

### Without division
Problem can be solved with two additional arrays - leftArr and rightArr with a size o "n" to store temporary product values.

Algorithm:   
#1 - set leftmost leftArr value to 1, set rightmost rightArr value to 1;
```
leftArr[0] = 1;
rightArr[arrLen - 1] = 1;
```
#2 - traverse the input array from left to right.
```
for (int i = 1 ; i < arrLen ; i++) {
```
#3 - set value of the current leftArr number to be the product of previous element value and previous input array number.
```
leftArr[i] = leftArr[i - 1] * numbers[i - 1]; }
```
#4 - traverse the input array again, from right to left.
```
for (int i = arrLen - 2 ; i > -1 ; i--) {
```
#5 - set value of current rightArr number to be product of the next element and next input array number
```
rightArr[i] = rightArr[i + 1] * numbers[i + 1]; }
```
#6 - multiply both arrays

Pros: 
- only three passes of initial array
- not using division