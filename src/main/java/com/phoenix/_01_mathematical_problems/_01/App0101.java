package com.phoenix._01_mathematical_problems._01;

public class App0101 {

  public static void main(String[] args) {

    double x1 = 3;
    double y1 = 4;
    double x2 = 7;
    double y2 = 1;

    double distance = calculateDistanceBetweenPointsWithHypot(x1, y1, x2, y2);

    System.out.println(distance);
  }

  public static double calculateDistanceBetweenPointsWithHypot(
      double x1,
      double y1,
      double x2,
      double y2) {

    double ac = Math.abs(y2 - y1);
    double cb = Math.abs(x2 - x1);

    return Math.hypot(ac, cb);
  }
}
