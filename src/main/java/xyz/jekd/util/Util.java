package xyz.jekd.util;

public class Util {
    public static <T extends Comparable<T>> void swap(T[] anArray, int i, int j) {

        T tmp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = tmp;
    }
}
