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
    public void test_sort__shuffled_String2() {
        InsertionSort is = new InsertionSort();
        String[] arr = {"a", "e", "d", "z", "w"};
        String[] expect = {"a", "d", "e", "w", "z"};

        String[] movedArr = is.sort(arr);

        assertArrayEquals(expect, movedArr);
    }

    @Test
    public void test_sort__shuffled_Integer() {
        Integer[] arr = {1, 24, 3, 67, 5};
        Integer[] expect = {1, 3, 5, 24, 67};

        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sort(arr);

        assertArrayEquals(expect, sortedArr);
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

    // -----------------------------------
    //            reverse
    // -----------------------------------

    @Test
    public void test_sort__reverse() {
        Integer[] arr = {5, 4, 3, 2, 1};
        Integer[] expect = {1, 2, 3, 4, 5};

        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }
}
