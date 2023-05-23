package com.demo;

import java.time.LocalDate;

public class IsLeapYear {

  public static boolean run(int year) {
    return LocalDate.of(year, 1, 1).isLeapYear();
  }
}
