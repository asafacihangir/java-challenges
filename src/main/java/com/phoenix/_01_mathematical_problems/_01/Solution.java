package com.phoenix._01_mathematical_problems._01;


public class Solution {


  public double test() {

    double lat1=43;
    double lon1=34;
    double lat2=23;
    double lon2=58;

    _distance(lat1,lon1,lat2,lon2);

    return 0;
  }


  private double _distance(double lat1, double lon1, double lat2, double lon2) {
    double theta = lon1 - lon2;
    if(lon2>lon1)
      theta = lon2 - lon1;
    double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
    dist = Math.acos(dist);
    dist = rad2deg(dist);
    dist = dist * 60 * 1.1515; // 60 is the number of minutes in a degree;  //1.1515 is the number of statute miles in a nautical mile.One nautical mile is the length of one minute of latitude at the equator.
    dist = dist * 1.609344;

    return (dist);
  }
  /* The function to convert decimal into radians */
  private double deg2rad(double deg) {
    return (deg * Math.PI / 180.0);
  }
  /* The function to convert radians into decimal */
  private double rad2deg(double rad) {
    return (rad * 180.0 / Math.PI);
  }
}

/*
    final int number = -6781;


    extractDigits(number);

    final int numberOfDigits = countDigits(number);
    System.out.printf("%s has %s digits%n", number, numberOfDigits);
*/


/*  public static void extractDigits(final int val) {
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
  }*/