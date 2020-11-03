package xyz.jekd.countingsort;

import xyz.jekd.util.Util;

import java.util.Arrays;

public class CountingSort {

    private Integer[] sortLittle(Integer[] aSrcArr) {

        Integer maxEle = Util.max(aSrcArr);
        Integer minEle = Util.min(aSrcArr);

        // for negative number
        Integer delta = minEle < 0 ? Math.abs(minEle) : 0;

        Integer[] arrForSort = new Integer[aSrcArr.length];
        for (int i = 0; i < aSrcArr.length; i++) {
            arrForSort[i] = aSrcArr[i] + delta;
        }

        Integer[] arrForCnt = getArrForCnt(arrForSort, maxEle + delta + 1);

        Integer[] accumulateCntArr = Util.accumulateCntArr(arrForCnt);

        Integer[] result = new Integer[aSrcArr.length];

        for (int j = arrForSort.length - 1; j >= 0; j--) {
            Integer toPutEle = arrForSort[j];

            Integer toPutIdx = accumulateCntArr[toPutEle] - 1;

            result[toPutIdx] = toPutEle - delta;

            accumulateCntArr[toPutEle]--;
        }

        return result;
    }

    private Integer[] getArrForCnt(Integer[] aArrForSort, int aArrForCntLength) {
        Integer[] arrForCnt = new Integer[aArrForCntLength];

        for (Integer e : aArrForSort) {
            if (null == arrForCnt[e]) {
                arrForCnt[e] = 1;
                continue;
            }
            arrForCnt[e]++;
        }
        return arrForCnt;
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

        return sortLittle(arrayForSort);
    }
}
