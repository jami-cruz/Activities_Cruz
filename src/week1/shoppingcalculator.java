/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Jami
 */
public class shoppingcalculator {
    

    public static void main(String[] args) {

        int quantity = 30;
        double unitPrice = 49.75;
        String storeName = "Tindahan Ni Carys";
        double totalCost = quantity * unitPrice;

        System.out.println("SHOPPING SUMMARY");
        System.out.println("-=-=-=-=-=-=-=-=-=");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);

    }
}

