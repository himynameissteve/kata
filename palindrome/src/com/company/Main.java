package com.company;

public class Main {

  public static void main(String[] args) {
    String input = "ABba";
    System.out.print(isPalindrome(input));
  }

  private static boolean isPalindrome(String input) {
    if (input.length() <= 1) {
      return true;
    }

    for (int i = 0, j = input.length() - 1; i <= j; i++, j--) {
      if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))) {
        return false;
      }
    }
    return true;
  }
}
