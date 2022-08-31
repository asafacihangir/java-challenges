package com.phoenix._01_mathematical_problems._01;

public class App0101 {

  public static void main(String[] args) {

    final int number = -6781;


    extractDigits(number);

    final int numberOfDigits = countDigits(number);
    System.out.printf("%s has %s digits%n", number, numberOfDigits);

  }

  public static void extractDigits(final int val) {
    int startValue = Math.abs(val);
    if(startValue / 10 > 0) {
      extractDigits(startValue / 10);
    }
    System.out.printf("%s ", startValue % 10);
  }

  public static int countDigits(final int val){
    int number = Math.abs(val);
    int count = 0;
    int divider = number;
    while (divider > 0 ){
      divider =  divider / 10;
      count++;
    }
    return count;
  }


}
