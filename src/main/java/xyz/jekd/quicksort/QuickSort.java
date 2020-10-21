package xyz.jekd.quicksort;

import xyz.jekd.util.Util;

import java.util.Arrays;

public class QuickSort {

    private <T extends Comparable<T>> int partition(T[] anArray, int p, int r) {

        // 索引 p 是这个小数组的起始索引
        // 索引 p 是被选取的分界点
        // 索引 index 是"候选的分界点"索引+1
        // 索引 index 增加意味着 "候选分界点指针"向右移动, 也是意味着要预留多一个位置给"小于分界点的那部分数组"
        int index = p + 1;

        // 索引 i 是未排序的那部分数组的"当前"索引
        for (int i = index; i <= r; i++) {
            if (anArray[i].compareTo(anArray[p]) < 0) {
                Util.swap(anArray, i, index);
                index++;
            }
        }
        Util.swap(anArray, p, index - 1);
        return index - 1;
    }

    private <T extends Comparable<T>> T[] sortLittle(T[] anArray, int p, int r) {

        if (p >= r) {
            return anArray;
        }

        int q = partition(anArray, p, r);
        sortLittle(anArray, p, q - 1);
        sortLittle(anArray, q + 1, r);

        return anArray;
    }

    public <T extends Comparable<T>> T[] sort(T[] anArray) {

        T[] arrayForSort = Arrays.copyOf(anArray, anArray.length);

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

        return sortLittle(arrayForSort, 0, arrayForSort.length - 1);
    }
}
