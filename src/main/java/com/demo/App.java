package com.demo;

import java.util.List;

public class App {

  public static void main(String[] args) {
    String s = "Hello world!!";
    //System.out.println(InvertString.run1(s));

    int number = 15351;
    System.out.println(IsCapicuaNumber.run(number));

    String text = "Hi everyone";
    //CharactersCounter.run(text);

    //System.out.println(RandomOrderString.run(text));

    List<String> stringList = List.of("s", "r", "r", "f", "i", "a", "a", "f");
    List<String> noDuplicate = GetNotDuplicateCharactersFromList.run(stringList);
    System.out.println(noDuplicate);

    String textWithVowel = "Alex";
    String textWithoutVowel = "BCND";
    System.out.println(CheckIfVowelIsPresent.run(textWithVowel));

    System.out.println(IsPalindrome.run("anna"));
  }
}
