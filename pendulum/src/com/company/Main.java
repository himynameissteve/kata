package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] result = asPendulum(new int[] {2, 1, 4, 3, 3});
    }

    private static int[] asPendulum(int[] input) {
        Arrays.sort(input);

        int result[] = new int[input.length];
        int i = (input.length - 1) / 2;
        int j = i + 1;
        int n = 0;

        for (int number : input) {
            // Switch between left and right as next element
            if (n++ % 2 == 0) {
                result[i] = number;
                i--;
            } else {
                result[j] = number;
                j++;
            }
        }
        return result;
    }
}
