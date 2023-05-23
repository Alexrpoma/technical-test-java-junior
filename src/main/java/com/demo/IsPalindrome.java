package com.demo;

public class IsPalindrome {

  public static boolean run(String s) {
    return s.toLowerCase().contentEquals(new StringBuilder(s.toLowerCase()).reverse());
  }
}
