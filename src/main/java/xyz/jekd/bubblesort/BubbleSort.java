package xyz.jekd.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    private void swap(String[] anArray, int i) {

        int j = i + 1;
        String tmp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = tmp;
    }

    public String[] sort(String[] anArray) {

        String[] arrayForSort = Arrays.copyOf(anArray, anArray.length);

        int len = arrayForSort.length;
        boolean flag;
        for (int i = 0; i < len - 1; i++) {
            flag = true;
            for (int j = 0; j < len - i - 1; j++) {
                String a = arrayForSort[j];
                String b = arrayForSort[j + 1];
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
