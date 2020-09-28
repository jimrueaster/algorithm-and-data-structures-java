package xyz.jekd.bubblesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void test_sort__normal() {
        String[] arr = {"a", "e", "d", "z", "w"};
        String[] expect = {"a", "d", "e", "w", "z"};
        BubbleSort bs = new BubbleSort();
        String[] sortedArr = bs.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }
}
