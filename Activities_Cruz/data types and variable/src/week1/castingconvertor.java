/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Jami
 */
public class castingconvertor {

    public static void main(String[] args) {

        double centimeters = 29.15;

        int wholeMeters = (int) (centimeters / 100);

        double remainingCentimeters = centimeters % 100;

        System.out.println("UNIT CASTING CONVERTER");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        int number = 10;
        double widenedNumber = number;

        System.out.println("Implicit Widening (int to double): " + widenedNumber);

        double decimalNumber = 12.75;
        int narrowedNumber = (int) decimalNumber;

        System.out.println("Explicit Narrowing (double to int): " + narrowedNumber);
    }
}
