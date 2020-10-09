package xyz.jekd.selectionsort;

import xyz.jekd.util.Util;

import java.util.Arrays;

public class SelectionSort {

    public <T extends Comparable<T>> T[] sort(T[] anArray) {

        T[] arrayForSort = Arrays.copyOf(anArray, anArray.length);

        for (int i = 0; i < anArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < anArray.length; j++) {
                if (arrayForSort[minIndex].compareTo(arrayForSort[j]) > 0) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                // only sway when i != minIndex
                Util.swap(arrayForSort, i, minIndex);
            }
        }

        return arrayForSort;
    }
}
