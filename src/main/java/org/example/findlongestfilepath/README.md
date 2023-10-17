# Find longest filepath
* [Problem](#problem)
* [Solution](#solution)

## Problem

Suppose we represent our file system by a string in the following manner:

The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
```
dir
    subdir1
    subdir2
        file.ext
```


The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.

The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:
```
dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext
```


The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.

We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).

Given a string representing the file system in the above format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.

Note:

The name of a file contains at least a period and an extension.

The name of a directory or sub-directory will not contain a period.

## Solution

First step was to break down how the file system nodes are represented in the input string.

The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
```
dir					// ""
    subdir1			// "\n\t"
    subdir2			// "\n\t
        file.ext	// "\n\t\t
```

The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:
```
dir						// ""
    subdir1				// "\n\t"
        file1.ext		// "\n\t\t"
        subsubdir1		// "\n\t\t"
    subdir2				// "\n\t"
        subsubdir2		// "\n\t\t"
            file2.ext	// "\n\t\t\t"
```

First node - root is represented without any prefixes, just its name. All the following nodes names start with a prefix '\n' and k number of '\t' where k is depth of the node.
In the first example both subdirectories of root node "subdir1" and "subdir2" start with the prefix "\n\t" and the "file2.ext" which is located inside "subdir2" has prefix "\n\t\t" which means its 2 levels deep in the file system structure.
The algorithm parses trough input once, character by character. In any point of its work it can perform do one of three actions:
- If the current character is '\n', it means its need to calculate depth of the next node. The previous and current depth are kept in memory
- If the current character is not '\n' it means it is a start of node name and if this node is higher in the structure go to the next step. If not, calculate node name length, add it to current path nodes names length list and if is the file calculate current file path length and check if it is longest yet.
- If current element is higher in the node structure - go up. It means algorithm removes last entries from the nodes names length list until the same depth is reached.
For example, in second input, going from "dir\subdir1\subsubdir1" to "dir\subdir2", means changing the node name length list from:
```
[3, 7, 9]
```
To:
[3, 7]