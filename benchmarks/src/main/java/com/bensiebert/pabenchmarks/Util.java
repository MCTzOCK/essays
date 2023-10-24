package com.bensiebert.pabenchmarks;

import java.util.Random;

public class Util {

    public static int randomNumber(int max) {
        return new Random().nextInt(max);
    }

    public static int[] randomArray(int length, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = randomNumber(max);
        }
        return array;
    }

}
