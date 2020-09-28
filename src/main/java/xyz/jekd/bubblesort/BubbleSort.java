package xyz.jekd.bubblesort;

public class BubbleSort {

    private void swap(String[] anArray, int i) {

        int j = i + 1;
        String tmp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = tmp;
    }

    public void sort(String[] anArray) {

        int len = anArray.length;
        boolean flag;
        do {
            flag = true;
            for (int j = 0; j < len - 1; j++) {

                String a = anArray[j];
                String b = anArray[j + 1];
                if (a.compareTo(b) > 0) {
                    swap(anArray, j);
                    flag = false;
                }
            }
        } while (!flag);
    }
}
