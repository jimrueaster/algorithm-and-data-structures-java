package xyz.jekd.bubblesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void test_sort__shuffled_String() {
        String[] arr = {"a", "e", "d", "z", "w"};
        String[] expect = {"a", "d", "e", "w", "z"};
        BubbleSort bs = new BubbleSort();
        String[] sortedArr = bs.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }

    @Test
    public void test_sort__shuffled_Integer() {
        Integer[] arr = {1, 24, 3, 67, 5};
        Integer[] expect = {1, 3 ,5, 24, 67};
        BubbleSort bs = new BubbleSort();
        Integer[] sortedArr = bs.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }
}
