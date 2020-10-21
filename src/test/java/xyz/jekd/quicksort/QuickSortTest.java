package xyz.jekd.quicksort;

import org.junit.jupiter.api.Test;
import xyz.jekd.selectionsort.SelectionSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    // -----------------------------------
    //           shuffled
    // -----------------------------------

    @Test
    public void test_sort__shuffled_String() {

        SelectionSort is = new SelectionSort();
        String[] arr = {"a", "z", "w", "e", "d", "t"};
        String[] expect = {"a", "d", "e", "t", "w", "z"};

        String[] movedArr = is.sort(arr);

        assertArrayEquals(expect, movedArr);
    }

    @Test
    public void test_sort__shuffled_Integer() {
        QuickSort sort = new QuickSort();

        Integer[] expect = {1, 3, 5, 7};

        Integer[] arr1 = {1, 3, 5, 7};
        Integer[] arr2 = {1, 5, 3, 7};
        Integer[] arr3 = {3, 1, 5, 7};
        Integer[] arr4 = {3, 5, 1, 7};
        Integer[] arr5 = {5, 1, 3, 7};
        Integer[] arr6 = {5, 3, 1, 7};

        Integer[] arr7 = {1, 3, 7, 5};
        Integer[] arr8 = {1, 5, 7, 3};
        Integer[] arr9 = {3, 1, 7, 5};
        Integer[] arr10 = {3, 5, 7, 1};
        Integer[] arr11 = {5, 1, 7, 3};
        Integer[] arr12 = {5, 3, 7, 1};

        Integer[] arr13 = {1, 7, 3, 5};
        Integer[] arr14 = {1, 7, 5, 3};
        Integer[] arr15 = {3, 7, 1, 5};
        Integer[] arr16 = {3, 7, 5, 1};
        Integer[] arr17 = {5, 7, 1, 3};
        Integer[] arr18 = {5, 7, 3, 1};

        Integer[] arr19 = {7, 1, 3, 5};
        Integer[] arr20 = {7, 1, 5, 3};
        Integer[] arr21 = {7, 3, 1, 5};
        Integer[] arr22 = {7, 3, 5, 1};
        Integer[] arr23 = {7, 5, 1, 3};
        Integer[] arr24 = {7, 5, 3, 1};

        Integer[] sortedArr1 = sort.sort(arr1);
        Integer[] sortedArr2 = sort.sort(arr2);
        Integer[] sortedArr3 = sort.sort(arr3);
        Integer[] sortedArr4 = sort.sort(arr4);
        Integer[] sortedArr5 = sort.sort(arr5);
        Integer[] sortedArr6 = sort.sort(arr6);

        Integer[] sortedArr7 = sort.sort(arr7);
        Integer[] sortedArr8 = sort.sort(arr8);
        Integer[] sortedArr9 = sort.sort(arr9);
        Integer[] sortedArr10 = sort.sort(arr10);
        Integer[] sortedArr11 = sort.sort(arr11);
        Integer[] sortedArr12 = sort.sort(arr12);

        Integer[] sortedArr13 = sort.sort(arr13);
        Integer[] sortedArr14 = sort.sort(arr14);
        Integer[] sortedArr15 = sort.sort(arr15);
        Integer[] sortedArr16 = sort.sort(arr16);
        Integer[] sortedArr17 = sort.sort(arr17);
        Integer[] sortedArr18 = sort.sort(arr18);

        Integer[] sortedArr19 = sort.sort(arr19);
        Integer[] sortedArr20 = sort.sort(arr20);
        Integer[] sortedArr21 = sort.sort(arr21);
        Integer[] sortedArr22 = sort.sort(arr22);
        Integer[] sortedArr23 = sort.sort(arr23);
        Integer[] sortedArr24 = sort.sort(arr24);

        assertArrayEquals(expect, sortedArr1);
        assertArrayEquals(expect, sortedArr2);
        assertArrayEquals(expect, sortedArr3);
        assertArrayEquals(expect, sortedArr4);
        assertArrayEquals(expect, sortedArr5);
        assertArrayEquals(expect, sortedArr6);

        assertArrayEquals(expect, sortedArr7);
        assertArrayEquals(expect, sortedArr8);
        assertArrayEquals(expect, sortedArr9);
        assertArrayEquals(expect, sortedArr10);
        assertArrayEquals(expect, sortedArr11);
        assertArrayEquals(expect, sortedArr12);

        assertArrayEquals(expect, sortedArr13);
        assertArrayEquals(expect, sortedArr14);
        assertArrayEquals(expect, sortedArr15);
        assertArrayEquals(expect, sortedArr16);
        assertArrayEquals(expect, sortedArr17);
        assertArrayEquals(expect, sortedArr18);

        assertArrayEquals(expect, sortedArr19);
        assertArrayEquals(expect, sortedArr20);
        assertArrayEquals(expect, sortedArr21);
        assertArrayEquals(expect, sortedArr22);
        assertArrayEquals(expect, sortedArr23);
        assertArrayEquals(expect, sortedArr24);
    }

    // -----------------------------------
    //            empty
    // -----------------------------------

    @Test
    public void test_sort__empty_Integer() {
        Integer[] arr = {};
        Integer[] expect = {};
        QuickSort sort = new QuickSort();
        Integer[] sortedArr = sort.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }

    // -----------------------------------
    //            len = 1
    // -----------------------------------
    @Test
    public void test_sort__len_one_Integer() {
        Integer[] arr = {1};
        Integer[] expect = {1};
        QuickSort sort = new QuickSort();
        Integer[] sortedArr = sort.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }
}
