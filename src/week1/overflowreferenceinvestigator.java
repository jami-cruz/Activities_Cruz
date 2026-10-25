/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Jami
 */
public class overflowreferenceinvestigator {

    public static void main(String[] args) {

        byte number = 127;
        number++;

        System.out.println("BYTE OVERFLOW");
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println("Byte after increment: " + number);

        String text1 = "Java";
        String text2 = "Java";
        String text3 = "Java";

        System.out.println("\nSTRING COMPARISON");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("text1 == text2: " + (text1.equals(text2)));
      
        System.out.println("text1.equals(text2): " + text1.equals(text2));

        System.out.println("text1 == text3: " + (text1.equals(text3)));

        System.out.println("text1.equals(text3): " + text1.equals(text3));
        
        System.out.println("text2 == text3: " + (text2.equals(text3)));

        System.out.println("text2.equals(text3): " + text2.equals(text3));

        System.out.println("\nSHARED ARRAY REFERENCE");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
        int[] array1 = {1, 2, 3};
        int[] array2 = array1;

        System.out.println("Before modification:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);

        array1[0] = 99;

        System.out.println("After modifying array1:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);

    }
}

