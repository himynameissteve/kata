package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String a = "abcdE";
        String b = "Edcba";

        System.out.print(isPermutation(a, b));
    }

    private static boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> first = new HashMap<Character, Integer>();

        for (int i = 0; i < a.length(); i++) {
            char character = Character.toLowerCase(a.charAt(i));
            if (first.containsKey(character)) {
                first.put(character, first.get(i) + 1);
            } else {
                first.put(character, 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char character = Character.toLowerCase(b.charAt(i));

            if (!first.containsKey(character)) {
                return false;
            }

            int count = first.get(character) - 1;

            if (count < 0) {
                return false;
            }

            first.put(character, count);
        }
        return true;
    }
}
