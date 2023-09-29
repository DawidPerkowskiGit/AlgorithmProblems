# Binary tree serialization/deserialization
* [Problem](#problem)
* [Solution](#solution)

## Problem
Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

```
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
```

The following test should pass:
```
node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'
```

## Solution

### Serialization
To solve this problem algorithm uses binary's tree id property. 
When parent node has id of "n" then left leaf has id of "2n+1" and right leaf has id of "2n+2".
When serializing to String a prefix was added
```
id.
```

For example, node root:
```
0.root
```
Each node was separated with empty space.

Algorithm keeps track of serialized nodes by using putting them into a stack and removing them after processing.

### Deserialization

Like with serialization algorithm keeps track of processed nodes by adding/removing them from the stack. 
All the nodes are stored in HashMap, when algorithm looks for left and right nodes it searches the HashMap.
