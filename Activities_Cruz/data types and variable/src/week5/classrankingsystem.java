/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Jami
 */
public class classrankingsystem {

        static class Student {

            String name;
            int[] quizzes;
            double average;

            Student(String name, int[] quizzes) {
                this.name = name;
                this.quizzes = quizzes;

                int sum = 0;

                for (int i = 0; i < quizzes.length; i++) {
                    sum += quizzes[i];
                }

                average = (double) sum / quizzes.length;
            }
        }

        public static void main(String[] args) {

            int[][] quizData = {
                {85, 90, 88, 92},
                {99, 82, 80, 84},
                {95, 93, 97, 96},
                {85, 90, 88, 92},
                {88, 86, 90, 84},
                {88, 78, 90, 79},
                {67, 99, 89, 89},
                {80, 90, 87, 99},
                {79, 85, 83, 96},
                {94, 82, 93, 82},
                {83, 95, 90, 84},
                {93, 93, 93, 95},
            };

            String[] names = {
                "Nicxie Ava",
                "Manuel Serrano",
                "Ryle Medina",
                "Nathan Parungao",
                "Hannah Parza",
                "Waki Regala",
                "Rich Balmaceda",
                "Zoe De Leon",
                "Jake Cruz",
                "Haily Aeon",
                "Aimee Ralph",
                "Shawn Salvacion",
            };

            Student[] students = new Student[quizData.length];

            for (int i = 0; i < quizData.length; i++) {
                students[i] = new Student(names[i], quizData[i]);
            }

            for (int i = 0; i < students.length - 1; i++) {
                for (int j = 0; j < students.length - 1 - i; j++) {

                    if (students[j].average < students[j + 1].average) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }

            System.out.println("======== CLASS RANKING SYSTEM ========");
            System.out.printf("%-8s %-15s %-10s%n", "Rank", "Name", "Average");
            System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");

            int rank = 1;

            for (int i = 0; i < students.length; i++) {

                if (i > 0 && students[i].average == students[i - 1].average) {
                } else {
                    rank = i + 1;
                }

                System.out.printf("%-8d %-15s %-10.2f%n",
                        rank, students[i].name, students[i].average);
                
            }

        }
        
        }

