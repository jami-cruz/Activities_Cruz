/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author Jami
 */
public class patterngenerator {
    public static void main(String[] args) {

            int size = 5;

            System.out.println("===== PATTERN GENERATOR =====");

            for (int row = 1; row <= size; row++) {

                if (row == 3) {
                    continue;
                }

                for (int col = 1; col <= row; col++) {

                    if (col == 4) {
                        break;
                    }

                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
                              
