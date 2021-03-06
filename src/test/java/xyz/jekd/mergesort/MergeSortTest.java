package xyz.jekd.mergesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    // -----------------------------------
    //           shuffled
    // -----------------------------------

    @Test
    public void test_sort__shuffled_Integer() {
        MergeSort is = new MergeSort();

        Integer[] expect = {1, 3, 5};

        Integer[] arr1 = {1, 3, 5};
        Integer[] arr2 = {1, 5, 3};
        Integer[] arr3 = {3, 1, 5};
        Integer[] arr4 = {3, 5, 1};
        Integer[] arr5 = {5, 1, 3};
        Integer[] arr6 = {5, 3, 1};

        Integer[] sortedArr1 = is.sort(arr1);
        Integer[] sortedArr2 = is.sort(arr2);
        Integer[] sortedArr3 = is.sort(arr3);
        Integer[] sortedArr4 = is.sort(arr4);
        Integer[] sortedArr5 = is.sort(arr5);
        Integer[] sortedArr6 = is.sort(arr6);

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
    public void test_sort__empty_Integer() {
        Integer[] arr = {};
        Integer[] expect = {};
        MergeSort bs = new MergeSort();
        Integer[] sortedArr = bs.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }

    // -----------------------------------
    //            len = 1
    // -----------------------------------
    @Test
    public void test_sort__len_one_Integer() {
        Integer[] arr = {1};
        Integer[] expect = {1};
        MergeSort bs = new MergeSort();
        Integer[] sortedArr = bs.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }
}
