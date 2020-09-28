package xyz.jekd.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    private <T extends Comparable<T>> void swap(T[] anArray, int i) {

        int j = i + 1;
        T tmp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = tmp;
    }

    public <T extends Comparable<T>> T[] sort(T[] anArray) {

        T[] arrayForSort = Arrays.copyOf(anArray, anArray.length);

        int len = arrayForSort.length;
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
