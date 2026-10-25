/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Jami
 */
public class classstatisticscalculator {
    
    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88, 76, 95, 81};

        int sum = 0;
        double average;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {

            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        average = (double) sum / scores.length;

        System.out.println("CLASS STATISTICS CALCULATOR");
        System.out.println("=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
