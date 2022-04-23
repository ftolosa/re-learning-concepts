package com.ftolosa.relearningconcepts.algorithms.impl;

import com.ftolosa.relearningconcepts.algorithms.Search;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    private Search searchAlgorithm = new LinearSearch();

    @Test
    void search() {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 15, 16, 17, 21, 23, 45, 50, 65, 66, 75, 80, 82, 85, 90, 91);
        Integer valueToSearch = 16;
        Integer expectedPosition = 5;
        Integer result = searchAlgorithm.search(list, valueToSearch);
        assertEquals(expectedPosition, result);
    }

    @Test
    void search2() {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 15, 16, 17, 21, 23, 45, 50, 65, 66, 75, 80, 82, 85, 90, 91);
        Integer valueToSearch = 50;
        Integer expectedPosition = 10;
        Integer result = searchAlgorithm.search(list, valueToSearch);
        assertEquals(expectedPosition, result);
    }
}