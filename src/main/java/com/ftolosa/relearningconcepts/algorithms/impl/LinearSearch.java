package com.ftolosa.relearningconcepts.algorithms.impl;

import com.ftolosa.relearningconcepts.algorithms.Search;

import java.util.List;

public class LinearSearch implements Search {

    @Override
    public Integer search(List<Integer> list, Integer valueToSearch) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(valueToSearch)) {
                return i;
            }
        }
        return -1;
    }
}
