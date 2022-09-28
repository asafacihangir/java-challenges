package com.phoenix._01_mathematical_problems._01;

public class App0103 {

  public static void main(String[] args) {
    isPrime(42);
  }

  public static boolean isPrime(int value) {
    boolean flag = false;
    for (int i = 2; i <= value / 2; ++i) {
      if (value % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag) {
      System.out.println(value + " is a prime number.");
    }
    else {
      System.out.println(value + " is not a prime number.");
    }
    return flag;
  }
}
