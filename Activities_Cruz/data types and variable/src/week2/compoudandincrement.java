/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Jami
 */
public class compoudandincrement {

    public static void main(String[] args) {

        double balance = 1234.0;

        System.out.println("COMPOUND GROWTH & INCREMENT TRACKER");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Initial Balance: " + balance);

        balance += 200;
        System.out.println("After adding 200: " + balance);

        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);

        balance += 150;
        System.out.println("After adding 150: " + balance);

        int count = 5;

        System.out.println("\nPostfix Increment:");
        System.out.println(count++);
        System.out.println(count);

        count = 5;

        System.out.println("\nPrefix Increment:");
        System.out.println(++count);
        System.out.println(count);
    }
}

