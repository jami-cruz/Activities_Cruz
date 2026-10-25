/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Jami
 */
import java.util.Arrays;

public class searchandsortminitool {
    
        public static void main(String[] args) {

            int[] scores = {85, 90, 78, 92, 88, 76, 95, 81};
            int target = 92;
            int index = -1;

            for (int i = 0; i < scores.length; i++) {

                if (scores[i] == target) {
                    index = i;
                    break;
                }
            }

            System.out.println("===== LINEAR SEARCH =====");

            if (index != -1) {
                System.out.println("Target " + target + " found at index: " + index);
            } else {
                System.out.println("Target " + target + " was not found.");
            }

            int[] sortedScores = Arrays.copyOf(scores, scores.length);

            Arrays.sort(sortedScores);

            System.out.println("\nSORT RESULTS");
            System.out.println("=-=-=-=-=-=-=");
            System.out.println("Original Array: " + Arrays.toString(scores));
            System.out.println("Sorted Array: " + Arrays.toString(sortedScores));

        }
    }
