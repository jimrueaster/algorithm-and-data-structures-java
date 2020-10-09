package xyz.jekd.bubblesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    // -----------------------------------
    //           shuffled
    // -----------------------------------
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
        BubbleSort bs = new BubbleSort();

        Integer[] expect = {1, 3, 5};

        Integer[] arr1 = {1, 3, 5};
        Integer[] arr2 = {1, 5, 3};
        Integer[] arr3 = {3, 1, 5};
        Integer[] arr4 = {3, 5, 1};
        Integer[] arr5 = {5, 1, 3};
        Integer[] arr6 = {5, 3, 1};

        Integer[] sortedArr1 = bs.sort(arr1);
        Integer[] sortedArr2 = bs.sort(arr2);
        Integer[] sortedArr3 = bs.sort(arr3);
        Integer[] sortedArr4 = bs.sort(arr4);
        Integer[] sortedArr5 = bs.sort(arr5);
        Integer[] sortedArr6 = bs.sort(arr6);

        assertArrayEquals(expect, sortedArr1);
        assertArrayEquals(expect, sortedArr2);
        assertArrayEquals(expect, sortedArr3);
        assertArrayEquals(expect, sortedArr4);
        assertArrayEquals(expect, sortedArr5);
        assertArrayEquals(expect, sortedArr6);
    }

    // -----------------------------------
    //            empty
    // -----------------------------------

    @Test
    public void test_sort__empty_String() {
        String[] arr = {};
        String[] expect = {};
        BubbleSort bs = new BubbleSort();
        String[] sortedArr = bs.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }

    // -----------------------------------
    //            len = 1
    // -----------------------------------
    @Test
    public void test_sort__len_one_String() {
        String[] arr = {"a"};
        String[] expect = {"a"};
        BubbleSort bs = new BubbleSort();
        String[] sortedArr = bs.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }
}
