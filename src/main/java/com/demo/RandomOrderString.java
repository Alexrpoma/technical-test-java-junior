package com.demo;

import java.util.Arrays;
import java.util.Collections;

public class RandomOrderString {

  public static String run(String s) {
    String[] letters = s.split("");
    Collections.shuffle(Arrays.asList(letters));
    StringBuilder text = new StringBuilder();
    Arrays.stream(letters).forEach(text::append);
    return text.toString();
  }
}
