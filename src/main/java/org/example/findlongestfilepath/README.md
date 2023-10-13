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

First step was to break down how the root directory, subdirectories and files are represented in the input.

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

First element of the input is root directory name. All the following element's names start with a prefix "\n" and k number of "/t".
Each "\t" represents deeper level of the structure. For example both direct subdirectories of "dir" start with the prefix "\n\t" and the "file2.ext" has a path "\dir\subdir2\subsubdir2\file2.ext" which means it is stored 3 level deep, so its prefix is "\n\t\t\t".

The problem can be solved this problem by using depth-first search algorithm used in graphs, since directory structure can be represented as one.
It travels from the root to end of first path, first it looks for the lower level element, if none found looks for the same level element, if none are found it travels up.
Algorithm checks the next elements' level by counting number of "\t" in the prefix. Algorithm finishes its work when it reaches end of the path.
