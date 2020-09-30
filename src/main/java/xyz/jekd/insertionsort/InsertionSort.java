package xyz.jekd.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public String[] sort(String[] anArray) {

        String[] arrayForSort = Arrays.copyOf(anArray, anArray.length);

        // i is the Sorted Part Right Border
        for (int rightBorder = 0; rightBorder < arrayForSort.length - 1; rightBorder++) {

            String eleWaitingToInsert = arrayForSort[rightBorder + 1];
            int insertToIndex;
            for (insertToIndex = rightBorder + 1; insertToIndex >= 0; insertToIndex--) {
                if (eleWaitingToInsert.compareTo(arrayForSort[insertToIndex]) > 0) {
                    insertToIndex++;
                    break;
                }
            }
            if (insertToIndex < rightBorder + 1) {

                System.arraycopy(arrayForSort, insertToIndex, arrayForSort, insertToIndex + 1,
                        rightBorder - insertToIndex + 1);
                arrayForSort[insertToIndex] = eleWaitingToInsert;
            }
        }

        return arrayForSort;
    }
}
