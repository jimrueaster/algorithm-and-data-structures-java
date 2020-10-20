package xyz.jekd.selectionsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

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
        SelectionSort ss = new SelectionSort();

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

        Integer[] sortedArr1 = ss.sort(arr1);
        Integer[] sortedArr2 = ss.sort(arr2);
        Integer[] sortedArr3 = ss.sort(arr3);
        Integer[] sortedArr4 = ss.sort(arr4);
        Integer[] sortedArr5 = ss.sort(arr5);
        Integer[] sortedArr6 = ss.sort(arr6);

        Integer[] sortedArr7 = ss.sort(arr7);
        Integer[] sortedArr8 = ss.sort(arr8);
        Integer[] sortedArr9 = ss.sort(arr9);
        Integer[] sortedArr10 = ss.sort(arr10);
        Integer[] sortedArr11 = ss.sort(arr11);
        Integer[] sortedArr12 = ss.sort(arr12);

        Integer[] sortedArr13 = ss.sort(arr13);
        Integer[] sortedArr14 = ss.sort(arr14);
        Integer[] sortedArr15 = ss.sort(arr15);
        Integer[] sortedArr16 = ss.sort(arr16);
        Integer[] sortedArr17 = ss.sort(arr17);
        Integer[] sortedArr18 = ss.sort(arr18);

        Integer[] sortedArr19 = ss.sort(arr19);
        Integer[] sortedArr20 = ss.sort(arr20);
        Integer[] sortedArr21 = ss.sort(arr21);
        Integer[] sortedArr22 = ss.sort(arr22);
        Integer[] sortedArr23 = ss.sort(arr23);
        Integer[] sortedArr24 = ss.sort(arr24);

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
    public void test_sort__empty_String() {
        String[] arr = {};
        String[] expect = {};
        SelectionSort bs = new SelectionSort();
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
        SelectionSort bs = new SelectionSort();
        String[] sortedArr = bs.sort(arr);

        assertArrayEquals(expect, sortedArr);
    }
}
