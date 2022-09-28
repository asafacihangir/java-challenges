package com.phoenix._01_mathematical_problems._01;

public class App0102 {

  public static void main(String[] args) {

    findProperDivisors(1234);
  }

  public static void findProperDivisors(final int value) {

    for (int i = 1; i <= value; i++) {
      if (value % i == 0) {
        System.out.print(i + " - ");
      }
    }
  }
}
