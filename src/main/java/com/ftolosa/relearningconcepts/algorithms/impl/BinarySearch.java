package com.ftolosa.relearningconcepts.algorithms.impl;

import com.ftolosa.relearningconcepts.algorithms.Search;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class BinarySearch implements Search {

    @Override
    public Integer search(List<Integer> list, Integer valueToSearch) {
        int lastPosition = list.size() -1;
        int firstPosition = 0;

        while(firstPosition <= lastPosition) {
            int middlePosition = (firstPosition + lastPosition) / 2;
            if(list.get(middlePosition).equals(valueToSearch)) {
                return middlePosition;
            } else if (list.get(middlePosition) > valueToSearch) {
                lastPosition = middlePosition - 1;
            } else {
                firstPosition = middlePosition + 1;
            }
        }

        return -1;
    }
}
