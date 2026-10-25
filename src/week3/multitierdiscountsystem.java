/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Jami
 */
public class multitierdiscountsystem {

        public static void main(String[] args) {

            double purchaseAmount = 6000.00;
            double discountRate;
            String discountTier;

            if (purchaseAmount >= 5000) {
                discountRate = 0.15;
                discountTier = "15% Discount";
            } else if (purchaseAmount >= 3000) {
                discountRate = 0.10;
                discountTier = "10% Discount";
            } else if (purchaseAmount >= 1000) {
                discountRate = 0.05;
                discountTier = "5% Discount";
            } else {
                discountRate = 0.00;
                discountTier = "No Discount (0%)";
            }

            double discountAmount = purchaseAmount * discountRate;
            double finalPrice = purchaseAmount - discountAmount;

            System.out.println("MULTI-TIER DISCOUNT SYSTEM");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Purchase Amount: PHP " + purchaseAmount);
            System.out.println("Discount Tier: " + discountTier);
            System.out.println("Discount Amount: PHP " + discountAmount);
            System.out.println("Final Discounted Price: PHP " + finalPrice);
        }
    }
