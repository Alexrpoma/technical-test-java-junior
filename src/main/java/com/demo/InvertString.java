package com.demo;

import java.util.Arrays;
import java.util.Collections;

public class InvertString {

  public static String run0(String s) {
    String[] arrayString = s.split("");
    Collections.reverse(Arrays.asList(arrayString));
    StringBuilder result = new StringBuilder();
    Arrays.asList(arrayString).forEach(result::append);
    return String.valueOf(result);
  }

  public static String run1(String s) {
    StringBuilder str = new StringBuilder();
    for (int i = s.length(); i > 0 ; i--) {
      str.append(s.charAt(i - 1));
    }
    return str.toString();
  }

  public static String runFast(String s) {
    return new StringBuilder(s).reverse().toString();
  }

}
