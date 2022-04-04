package com.geekbrains;

import java.util.Arrays;

public class Lesson36 {
    public int[] getArraySliceBy4(int[] array) throws RuntimeException {
        if (array.length == 0) throw new RuntimeException();

        int idx = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                idx = i;
                break;
            }
        }

        if (idx < 0) throw new RuntimeException();

        if (idx == array.length - 1) return new int[0];

        return Arrays.copyOfRange(array, idx + 1, array.length);
    }

    public boolean testDigits(int[] array) {
        boolean testOne = false;
        boolean testFour = false;

        for (int number : array) {
            if (number == 1) {
                testOne = true;
            } else if (number == 4) {
                testFour = true;
            } else return false;
        }
        return testFour && testOne;
    }
}
