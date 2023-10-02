# Missing positive integer in array
* [Problem](#problem)
* [Solution](#solution)

## Problem
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
## Solution
The algorithm has time complexity of O(n) and space complexity of 0(1).
First the algorithm sorts the array by putting non-positive numbers on the end of the array, while keeping them separated from positive numbers.
The sorting method passed through array single time and returns number of positive numbers.
For example:
```
input = {1, -1, -5, -3, 3, 4, 2, 8}
output = {1, 8, 2, 4, 3, -3, -5, -1};
counter = 5;
```
Since there are 5 positive numbers to check, the result of finding the missing integer will be any number from the array A = {1, 2, 3, 4, 5}
Secondly algorithm passes through positive numbers input array (from left to right, last positive number has index of counter - 1) to mark every number which is present in the array A (value not greater than counter) and if current number is bigger than counter, do nothing.
It achieves this by changing the number to negative. For example if number 4 was found in the input array, the algorithm sets to negative number of index 3 (4 - 1).
Since the index is calculated based upon number's value which can be negative, the value have to be absolute.
Result of traversing through the example arary:
```
input = {1, 8, 2, 4, 3, -3, -5, -1};
output = {-1, -8, -2, -4, 3, -3, -5, -1};
```
Lastly algorithm passes through the same values as in the step 2. If it finds positive number, answer to the problem is index +1. If it does not counter + 1 is the answer.
Since:
```
input = {-1, -8, -2, -4, 3, -3, -5, -1};
array A = {1, 2, 3, 4, 5, 6}
```
can be translated to
```
index 0 = -1 => negative; number 0 + 1 = 1 was present in the initial array
index 1 = -8 => negative; number 1 + 1 = 2 was present in the initial array
index 2 = -2 => negative; number 2 + 1 = 3 was present in the initial array
index 3 = -4 => negative; number 3 + 1 = 4 was present in the initial array
index 4 = 3 => positive; number 4 + 1 = 5 was NOT present in the initial array
```

Another example:
```
input = {2, 0, 3, 4, 1}
sorted = {2, 1, 3, 4, 0}
counter = 4

#1 marked = {2, -1, 3, 4, 0} (abs(2) - 1 = 1. Number of index 1 has to be set to negative 1 => -1)
#2 marked = {-2, -1, 3, 4, 0} (abs(-1) - 1 = 0. Number of index 0 has to be set to nagative 2 => -2)
#3 marked = {-2, -1, -3, 4, 0} (abs(-3) - 1 = 2. Number of index 2 has to be set to nagative 3 => -3)
#4 marked = {-2, -1, -3, -4, 0} (abs(-4) - 1 = 3. Number of index 3 has to be set to nagative 4 => -4)

No positive numbers found => First positive integer missing = 4 + 1 = 5
```