# Pick random element from infinite stream
* [Problem](#problem)
* [Solution](#solution)

## Problem
Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.

## Solution
This solutions calls function on every element of a stream which decides if current element is picked. As the elements of stream come in another element can be picked. It generates random number from 1 to current stream elements counter.