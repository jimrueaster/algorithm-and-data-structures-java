package xyz.jekd.bubblesort;

import xyz.jekd.util.Util;

import java.util.Arrays;

public class BubbleSort {

    private <T extends Comparable<T>> void swap(T[] anArray, int i) {

        Util.swap(anArray, i, i + 1);
    }

    public <T extends Comparable<T>> T[] sort(T[] anArray) {

        int len = anArray.length;
        if (len <= 1) {
            return anArray;
        }

        T[] arrayForSort = Arrays.copyOf(anArray, len);

        boolean flag;
        for (int i = 0; i < len - 1; i++) {
            flag = true;
            for (int j = 0; j < len - i - 1; j++) {
                T a = arrayForSort[j];
                T b = arrayForSort[j + 1];
                if (a.compareTo(b) > 0) {
                    swap(arrayForSort, j);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arrayForSort;
    }
}
