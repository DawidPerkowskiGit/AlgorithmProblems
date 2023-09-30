package org.example.arraydiff;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayDiff {

    public int[] removeElements(int[] arrayA, int[] arrayB) {

        List<Integer> listA = new LinkedList<>(Arrays.stream(arrayA).boxed().toList());

        List<Integer> listB = new LinkedList<>(Arrays.stream(arrayB).boxed().toList());

        listA.removeAll(listB);

        int[] returnList = new int[listA.size()];
        int iterator = 0;
        for (Integer entry: listA
             ) {
            returnList[iterator] = entry.intValue();
            iterator++;
        }
        return returnList;
    }
}
