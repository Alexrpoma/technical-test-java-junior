package com.demo;

public class IsCapicuaNumber {

  public static boolean run(int number) {
    String str = String.valueOf(number);
    return str.contentEquals(new StringBuilder(str).reverse());
  }
}
