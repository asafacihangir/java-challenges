package com.phoenix._01_mathematical_problems._01;

public class App0101 {

  public static void main(String[] args) {

    final int number = 6534627;

    extractDigits(number);

    final int numberOfDigits = countDigits(number);
    System.out.printf("%s has %s digits%n", number, numberOfDigits);
  }

  public static void extractDigits(final int startValue) {

    if(startValue / 10 > 0) {
      extractDigits(startValue / 10);
    }
    System.out.printf("%s ", startValue % 10);

  }

  public static int countDigits(final int number){

    if (number > 0){

      return String.valueOf(number).length();
    }else {

    return 0;
  }}

}
