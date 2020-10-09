package xyz.jekd.insertionsort;

import org.junit.jupiter.api.Test;
import xyz.jekd.bubblesort.BubbleSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    // -----------------------------------
    //           shuffled
    // -----------------------------------
    @Test
    public void test_sort__shuffled_String() {

        InsertionSort is = new InsertionSort();
        String[] arr = {"a", "z", "w", "e", "d", "t"};
        String[] expect = {"a", "d", "e", "t", "w", "z"};

        String[] movedArr = is.sort(arr);

        assertArrayEquals(expect, movedArr);
    }

    @Test
    public void test_sort__shuffled_Integer() {
        InsertionSort is = new InsertionSort();

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
