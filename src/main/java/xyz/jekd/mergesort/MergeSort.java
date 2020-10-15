package xyz.jekd.mergesort;

import xyz.jekd.util.Util;

import java.util.Arrays;

public class MergeSort {

    private Integer[] merge(Integer[] aArr, Integer[] bArr) {

        int m = aArr.length;
        int n = bArr.length;
        int i = 0;
        int j = 0;
        Integer[] result = new Integer[m + n];
        while (i < m && j < n) {
            if (aArr[i].compareTo(bArr[j]) <= 0) {
                result[i + j] = aArr[i];
                i++;
            } else {
                result[i + j] = bArr[j];
                j++;
            }
        }
        if (i == m) {
            System.arraycopy(bArr, j, result, i + j, n - j);
        } else if (j == n) {
            System.arraycopy(aArr, i, result, i + j, m - i);
        }
        return result;
    }

    public Integer[] sort(Integer[] anArray) {

        Integer[] arrayForSort = Arrays.copyOf(anArray, anArray.length);

        if (arrayForSort.length <= 1) {
            return arrayForSort;
        }

        if (2 == arrayForSort.length) {
            if (arrayForSort[0].compareTo(arrayForSort[1]) < 0) {
                return arrayForSort;
            }
            Util.swap(arrayForSort, 0, 1);
            return arrayForSort;
        }

        int divideInt = (int) Math.floor((double) arrayForSort.length / 2);
        Integer[] partA = Arrays.copyOfRange(arrayForSort, 0, divideInt);
        Integer[] partB = Arrays.copyOfRange(arrayForSort, divideInt, arrayForSort.length);

        return merge(sort(partA), sort(partB));
    }
}
