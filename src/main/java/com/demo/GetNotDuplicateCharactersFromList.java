package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetNotDuplicateCharactersFromList {

  public static List<String> run(List<String> stringList) {
    Set<String> stringSet = new HashSet<>(stringList);
    return new ArrayList<>(stringSet);
  }
}
