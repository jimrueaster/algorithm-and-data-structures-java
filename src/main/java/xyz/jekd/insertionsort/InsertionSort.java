package xyz.jekd.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public <T extends Comparable<T>> T[] sort(T[] anArray) {

        T[] arrayForSort = Arrays.copyOf(anArray, anArray.length);

        for (int toSortIdx = 1; toSortIdx < arrayForSort.length; toSortIdx++) {

            T toSortVal = arrayForSort[toSortIdx];
            int insertToIndex;
            for (insertToIndex = toSortIdx - 1; insertToIndex >= 0; insertToIndex--) {
                if (toSortVal.compareTo(arrayForSort[insertToIndex]) >= 0) {
                    break;
                }
                arrayForSort[insertToIndex + 1] = arrayForSort[insertToIndex];
            }

            arrayForSort[insertToIndex + 1] = toSortVal;
        }

        return arrayForSort;
    }
}
