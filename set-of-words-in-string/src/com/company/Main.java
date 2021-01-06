package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.print(longestWord("abppplee", Arrays.asList("able", "ale", "apple", "bale", "kangaroo")));
    }

    private static String longestWord(String input, List<String> words) {
        words.sort(Comparator.comparingInt(String::length).reversed());
        for (String word : words) {
            for (int i = 0, j = 0; i < input.length(); i++) {
                if (input.charAt(i) == word.charAt(j)) {
                    if (word.length() - 1 == j) {
                        return word;
                    }
                    j++;
                }
            }
        }
        return "";
    }
}
