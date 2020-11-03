package xyz.jekd.util;

public class Util {
    public static <T extends Comparable<T>> void swap(T[] anArray, int i, int j) {

        T tmp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = tmp;
    }

    public static Integer max(Integer[] aSrcArray) {
        assert aSrcArray.length > 0;
        int maxEleIdx = 0;

        for (int i = 1; i < aSrcArray.length; i++) {
            if (aSrcArray[i].compareTo(aSrcArray[maxEleIdx]) <= 0) {
                continue;
            }
            maxEleIdx = i;
        }
        return aSrcArray[maxEleIdx];
    }

    public static Integer min(Integer[] aSrcArray) {
        assert aSrcArray.length > 0;
        int minEleIdx = 0;

        for (int i = 1; i < aSrcArray.length; i++) {
            if (aSrcArray[i].compareTo(aSrcArray[minEleIdx]) >= 0) {
                continue;
            }
            minEleIdx = i;
        }
        return aSrcArray[minEleIdx];
    }

    public static Integer accumulateArr(Integer[] anArr, int fromIdx, int toIdx) {

        Integer result = 0;
        assert fromIdx <= toIdx;

        for (int i = fromIdx; i <= toIdx; i++) {
            if (null == anArr[i]) {
                continue;
            }
            result += anArr[i];
        }
        return result;
    }

    public static Integer[] accumulateCntArr(Integer[] aCntArr) {

        Integer[] result = new Integer[aCntArr.length];

        for (int i = 0; i < aCntArr.length; i++) {
            result[i] = accumulateArr(aCntArr, 0, i);
        }
        return result;
    }
}
