package org.example.findlongestfilepath;

import java.util.LinkedList;
import java.util.List;

public class FindLongestFilepath {

    private final int FIND_FS_NODE = 0;

    private final int CALCULATE_DEPTH = 1;

    private final int GO_UP = 2;

    private final char FILE_EXTENSION_DOT = '.';

    private final char FS_NODE_NAME_PREFIX_N = '\n';

    private final char FS_NODE_NAME_PREFIX_T = '\t';



    public int find(String path) {
        int pathLength = path.length();
        int leftIndex = 0;
        int rightIndex = 0;
        int previousDepth = 0;
        int longestFilePath = 0;
        List<Integer> currentPathFsNodes = new LinkedList<>();

        int currentMode = FIND_FS_NODE;
        int currentDepth = 0;

        boolean isFile = false;
        while (rightIndex < pathLength) {
            switch (currentMode) {
                case FIND_FS_NODE -> {
                    if (currentDepth < previousDepth) {
                        currentMode = GO_UP;
                        break;
                    }

                    isFile = false;

                    while (rightIndex < pathLength) {
                        if (path.charAt(rightIndex) != FS_NODE_NAME_PREFIX_N) {
                            if (path.charAt(rightIndex) == FILE_EXTENSION_DOT) {
                                isFile = true;
                            }
                            rightIndex++;
                        }
                        else {
                            break;
                        }
                    }

                    int currentFsNodeNameLength = rightIndex - leftIndex;
                    if (currentDepth > previousDepth || currentDepth == 0) {
                        currentPathFsNodes.add(currentFsNodeNameLength);
                    }
                    else if (currentDepth == previousDepth) {
                        if (currentFsNodeNameLength > currentPathFsNodes.get(currentDepth) && isFile) {
                            currentPathFsNodes.set(currentDepth, currentFsNodeNameLength);
                        }
                    }

                    if (isFile) {
                        int currentFilePathLength = 0;
                        for (Integer length: currentPathFsNodes
                        ) {
                            currentFilePathLength+=length;
                        }

                        currentFilePathLength += currentDepth;

                        longestFilePath = Math.max(currentFilePathLength, longestFilePath);
                    }

                    leftIndex = rightIndex;
                    currentMode = CALCULATE_DEPTH;
                }

                case CALCULATE_DEPTH -> {
                    previousDepth = currentDepth;
                    currentDepth = 0;
                    if (path.charAt(rightIndex) == FS_NODE_NAME_PREFIX_N) {
                        rightIndex++;
                        while (path.charAt(rightIndex) == FS_NODE_NAME_PREFIX_T) {
                            currentDepth++;
                            rightIndex++;
                        }
                    }
                    leftIndex = rightIndex;
                    currentMode = FIND_FS_NODE;
                }

                case GO_UP -> {
                    while(currentDepth <= previousDepth) {
                        currentPathFsNodes.remove(currentPathFsNodes.size() - 1);
                        previousDepth--;
                    }

                    currentMode = FIND_FS_NODE;
                }
            }
        }
        if (longestFilePath == 0) {
            for (Integer length: currentPathFsNodes
            ) {
                longestFilePath+=length;
            }
        }
        return longestFilePath;
    }

}
