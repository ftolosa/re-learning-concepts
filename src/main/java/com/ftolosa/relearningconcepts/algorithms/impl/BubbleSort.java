package com.ftolosa.relearningconcepts.algorithms.impl;

import com.ftolosa.relearningconcepts.algorithms.Sort;

import java.util.List;

public class BubbleSort implements Sort {

    @Override
    public List<Integer> sort(List<Integer> list) {
        for (int limit = list.size() -1; limit > 0; limit--) {
            for (int i = 0; i < limit; i++) {
                int secondIndex = i + 1;
                Integer first = list.get(i);
                System.out.println("first: " + first);
                Integer second = list.get(secondIndex);
                System.out.println("second: " + second);
                if (first > second) {
                    System.out.println("first: " + first + " > a second: " + second);
                    list.set(i, second);
                    System.out.println("index " + i + "=" + second);
                    list.set(secondIndex, first);
                    System.out.println("index " + secondIndex + "=" + first);
                    System.out.println(list);
                }
            }
        }
        return list;
    }
}
