# Parity outlier
* [Problem](#problem)
* [Solution](#solution)

## Problem
You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
Examples

```
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)
```

```
[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
```



## Solution

Algorithm iterates over the list and counts how many times odd and even numbers were encountered. 
If in any point of going through the list both counter are bigger than 1, and one of them is bigger that means that lower counter value points to the outlier.
Last even and odd number indexes are saved, so algorithm returns outlier located at the index in the list.
