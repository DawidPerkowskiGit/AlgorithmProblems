package org.example.findlongestfilepath;

import java.util.LinkedList;
import java.util.List;

public class FindLongestFilepath {

    private final int FIND_ELEMENT = 0;

    private final int CALCULATE_DEPTH = 1;

    private final int GO_UP = 2;

    private final char FILE_EXTENSION_DOT = '.';

    private final char SUB_ELEMENT_PREFIX_SLASH = '\\';

//    private final char SUB_ELEMENT_PREFIX_N = 'n';
//
//    private final char SUB_ELEMENT_PREFIX_T = 't';


    private final char SUB_ELEMENT_PREFIX_N = '\n';

    private final char SUB_ELEMENT_PREFIX_T = '\t';



    public int find(String path) {
        int pathLength = path.length();
        int leftIndex = 0;
        int rightIndex = 0;
        int currentDepth = 0;
        int longestFilePath = 0;
        List<Integer> currentPathElementsNameLength = new LinkedList<>();

        int currentMode = FIND_ELEMENT;
        int nextElementDepth = 0;

        boolean isFile = false;
        while (rightIndex < pathLength) {
            switch (currentMode) {
                case FIND_ELEMENT -> {
                    if (nextElementDepth < currentDepth) {
                        currentMode = GO_UP;
                        break;
                    }

                    isFile = false;


//                    if (rightIndex < pathLength) {
//                        while (path.charAt(rightIndex) != SUB_ELEMENT_PREFIX_N) {
//                            if (path.charAt(rightIndex) == FILE_EXTENSION_DOT) {
//                                isFile = true;
//                            }
//                            rightIndex++;
//                        }
//                    }


                    while (rightIndex < pathLength) {
                        if (path.charAt(rightIndex) != SUB_ELEMENT_PREFIX_N) {
                            if (path.charAt(rightIndex) == FILE_EXTENSION_DOT) {
                                isFile = true;
                            }
                            rightIndex++;
                        }
                        else {
                            break;
                        }
                    }



                    int tempCurrentElementNameLength = rightIndex - leftIndex;
                    if (nextElementDepth > currentDepth) {
                        currentPathElementsNameLength.add(tempCurrentElementNameLength);
                    }
                    else if (nextElementDepth == currentDepth && nextElementDepth != 0) {
                        if (tempCurrentElementNameLength > currentPathElementsNameLength.get(currentPathElementsNameLength.size())) {
                            currentPathElementsNameLength.remove(currentPathElementsNameLength.size());
                            currentPathElementsNameLength.add(tempCurrentElementNameLength);
                        }
                    }

                    leftIndex = rightIndex;
                    nextElementDepth = 0;
                    currentMode = CALCULATE_DEPTH;
                }
                case CALCULATE_DEPTH -> {
                    currentDepth = nextElementDepth;
                    if (path.charAt(rightIndex) == SUB_ELEMENT_PREFIX_N) {
                        rightIndex++;
                        while (path.charAt(rightIndex) == SUB_ELEMENT_PREFIX_T) {
                            nextElementDepth++;
                            rightIndex++;
                        }
                    }
                    leftIndex = rightIndex;
                    currentMode = FIND_ELEMENT;
                }
                case GO_UP -> {
                    if (isFile) {
                        int currentFilePathLength = 0;
                        for (Integer length: currentPathElementsNameLength
                             ) {
                            currentFilePathLength+=length;
                        }

                        currentFilePathLength += currentDepth;

                        longestFilePath = Math.max(currentFilePathLength, longestFilePath);
                    }

                    while(nextElementDepth <= currentDepth) {
                        currentPathElementsNameLength.remove(currentPathElementsNameLength.size());
                        currentDepth--;
                    }

                    currentMode = FIND_ELEMENT;
                }
            }
        }
        if (longestFilePath == 0) {
            for (Integer length: currentPathElementsNameLength
            ) {
                longestFilePath+=length;
            }
        }
        return longestFilePath;
    }

}
