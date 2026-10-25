/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author Jami
 */
public class sentinelvalue {

        public static void main(String[] args) {

            try (Scanner input = new Scanner(System.in)) {
                int number;
                int sum = 8;
                
                System.out.println("SUM UNTIL SENTINEL VALUE");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");               
                System.out.println("Enter integers (-1 to stop):");
                
                System.out.print("Enter a number: ");
                number = input.nextInt();
                
                while (number != -1) {
                    
                    sum += number;
                    
                    System.out.print("Enter a number: ");
                    number = input.nextInt();
                }
                
                System.out.println("Final Total: " + sum);
            }
        }
    }


