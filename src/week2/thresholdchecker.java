/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Jami
 */
public class thresholdchecker {
    public static void main(String[] args) {
        int average = 87;
        int absence = 2;
        boolean grade = average >= 75 && absence <=3;
        
        
        System.out.println("GRADE THRESHOLD CHECKER");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Pass or Failed?");        
        System.out.println(grade ? "Pass" : "Failed");

    }
}