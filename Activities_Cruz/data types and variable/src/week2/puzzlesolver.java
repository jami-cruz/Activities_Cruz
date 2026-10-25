/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Jami
 */
public class puzzlesolver {

        public static void main(String[] args) {

            int a = 7;
            int b = 6;
            int count = 4;

            boolean result1 = a + b * 2 > 10 && b < 5;
            int result2 = count++ + 2;
            boolean result3 = ++count > 5 || a - b == 2;
            
            System.out.println("PRECEDENCE PUZZLE SOLVER");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Expression 1: " + result1);
            System.out.println("Expression 2: " + result2);
            System.out.println("Count after Expression 2: " + count);
            System.out.println("Expression 3: " + result3);
            System.out.println("Count after Expression 3: " + count);
        }
    }


