package xyz.jekd.insertionsort;

import org.junit.jupiter.api.Test;
import xyz.jekd.bubblesort.BubbleSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    // -----------------------------------
    //           moveElementsToNext
    // -----------------------------------
    @Test
    public void test_sort__normal() {

        InsertionSort is = new InsertionSort();
        String[] arr = {"a", "z", "w", "e", "d", "t"};
        String[] expect = {"a",  "d", "e", "t", "w", "z"};

        String[] movedArr = is.sort(arr);

        for (String a: movedArr
             ) {
            System.out.println(a);
        }

        assertArrayEquals(expect, movedArr);
    }

    @Test
    public void test_sort__normal2() {

        InsertionSort is = new InsertionSort();
        String[] arr = {"a", "e", "d", "z", "w"};
        String[] expect = {"a",  "d", "e", "w", "z"};

        String[] movedArr = is.sort(arr);

        for (String a: movedArr
        ) {
            System.out.println(a);
        }

        assertArrayEquals(expect, movedArr);
    }

}
