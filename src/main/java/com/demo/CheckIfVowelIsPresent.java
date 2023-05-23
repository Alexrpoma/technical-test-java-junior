package com.demo;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class CheckIfVowelIsPresent {

  public static boolean run(String s) {

    // slow method:
    boolean containVowel = Arrays.stream(s.split("")).anyMatch(
      letter -> letter.equals("a")
        || letter.equals("e")
        || letter.equals("i")
        || letter.equals("o")
        || letter.equals("u")
    );

    // Direct method
    return s.matches(".*[aeiou].*");
  }
}
