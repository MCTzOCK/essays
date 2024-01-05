package com.bensiebert.pabenchmarks;

import com.bensiebert.pabenchmarks.algo.BubbleSort;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < Preferences.ARRAY_SIZES.length; i++) {

            System.out.println("Executing BubbleSort with array size " + Preferences.ARRAY_SIZES[i] + "...");

            long startTime = System.nanoTime();

            int[] randArr = Util.randomArray(Preferences.ARRAY_SIZES[i], Preferences.ARRAY_MAX);

            BubbleSort.sort(randArr);

            long endTime = System.nanoTime();

            long elapsedTime = endTime - startTime;
            long elapsedSeconds = elapsedTime / 1000000000;

            System.out.println("Generated array of size " + Preferences.ARRAY_SIZES[i] + " in " + elapsedSeconds + " seconds.");

        }
    }

}
