package com.bensiebert.pabenchmarks.algo;

public class BubbleSort {

    public static int[] sort(int[] unsorted) {
        int[] sorted = unsorted.clone();
        int n = sorted.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (sorted[j - 1] > sorted[j]) {
                    temp = sorted[j - 1];
                    sorted[j - 1] = sorted[j];
                    sorted[j] = temp;
                }

            }
        }

        return sorted;
    }

}
