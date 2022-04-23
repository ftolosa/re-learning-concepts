package com.ftolosa.relearningconcepts.algorithms.impl;

import com.ftolosa.relearningconcepts.algorithms.Sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private Sort sortAlgorithm = new BubbleSort();

    @Test
    void sort() {
        List<Integer> list = Arrays.asList(91, 85, 1, 5, 84, 75, 17, 20, 101);
        List<Integer> expectedList = Arrays.asList(1, 5, 17, 20, 84, 85, 91, 101);
        List<Integer> sorted = sortAlgorithm.sort(list);
        assertEquals(expectedList, sorted);
    }
}