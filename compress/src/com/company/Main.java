package com.company;

public class Main {

    public static void main(String[] args) {
      System.out.println(compress("AAABBBBC"));
    }

    private static String compress(String input) {
      StringBuilder result = new StringBuilder();
      int count = 1;

      for (int i = 0; i < input.length(); i++) {
        if (input.length() > i + 1 && input.charAt(i) == input.charAt(i + 1)) {
          count++;
        } else {
          result.append(count);
          result.append(input.charAt(i));
          count = 1;
          if (result.length() >= input.length()) return input;
        }
      }
      return result.toString();
    }
}
