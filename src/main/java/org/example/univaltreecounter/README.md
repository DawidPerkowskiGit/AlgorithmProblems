# Unival tree counter
* [Problem](#problem)
* [Solution](#solution)

## Problem
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:
```
        0
       / \
      1   0
     / \
    1   0
   / \
  1   1
```



## Solution
First algorithm checks if root is unival, if it is and any/both nodes exist uses recursion to check them and their children if they are unival. 