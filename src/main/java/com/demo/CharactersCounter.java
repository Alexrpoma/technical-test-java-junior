package com.demo;

import java.util.HashMap;
import java.util.Map;

public class CharactersCounter {

  public static void run(String s) {
    Map<String, Integer> counterCharacters = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      String character = String.valueOf(s.charAt(i));
      if (!character.equals(" ")) {
        if (counterCharacters.containsKey(character)) {
          counterCharacters.replace(character, counterCharacters.get(character) + 1);
        } else {
          counterCharacters.put(character, 1);
        }
      }
    }
    System.out.println(counterCharacters);
  }
}
