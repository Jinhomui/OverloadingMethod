package com.company;

public class Main {

    public static void main(String[] args) {

        double cm;
        cm = calcFeedAndInchesToCentimeters(6, 0);
        if (cm < 0) {
            System.out.println("Invalid Parameters");
        }
        calcFeedAndInchesToCentimeters(157);
    }

    public static double calcFeedAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        }
        double cm = (30.48 * feet) + (2.54 * inches);
        System.out.println(feet + " ft " + inches + " in = " + cm + " cm");
        return cm;
    }

    public static double calcFeedAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameter.");
            return -1;
        }
        double feet = (int) inches / 12;
        double Inchremainder = inches % 12;
        System.out.println(inches + " inches = " + feet + " ft " + Inchremainder + " inches");
        return calcFeedAndInchesToCentimeters(feet, Inchremainder);    //callout parameters and return at the same time

    }
}



