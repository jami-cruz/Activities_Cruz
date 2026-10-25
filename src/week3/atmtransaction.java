/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Jami
 */
public class atmtransaction {

        public static void main(String[] args) {

            String correctUsername = "jammieeccruz";
            String correctPIN = "0711";

            String username = "jammieeccruz";
            String pin = "0711";

            double balance = 4000.0;
            double withdrawalAmount = 500.0;

            String accountTier = "Bronze";
            double dailyLimit = 0.0;
            double feePercentage = 0.0;

            boolean approved = false;
            String reason = "";

            if (username.equals(correctUsername)) {

                if (pin.equals(correctPIN) && pin.length() == 4) {

                    if (balance < 10000) {
                        accountTier = "Bronze";
                        dailyLimit = 5000;
                    } else if (balance < 50000) {
                        accountTier = "Silver";
                        dailyLimit = 15000;
                    } else if (balance < 100000) {
                        accountTier = "Gold";
                        dailyLimit = 30000;
                    } else {
                        accountTier = "Platinum";
                        dailyLimit = 50000;
                    }

                    switch (accountTier) {
                        case "Bronze":
                            feePercentage = 0.02;
                            break;
                        case "Silver":
                            feePercentage = 0.015;
                            break;
                        case "Gold":
                            feePercentage = 0.01;
                            break;
                        case "Platinum":
                            feePercentage = 0.005;
                            break;
                        default:
                            reason = "Invalid account tier.";
                    }

                    if (withdrawalAmount > 0) {

                        if (withdrawalAmount <= balance) {

                            if (withdrawalAmount <= dailyLimit) {

                                double fee = withdrawalAmount * feePercentage;
                                double totalAmount = withdrawalAmount + fee;

                                if (totalAmount <= balance) {
                                    approved = true;
                                    reason = "Transaction meets all requirements.";
                                } else {
                                    reason = "Insufficient balance to cover withdrawal and fee.";
                                }

                            } else {
                                reason = "Withdrawal exceeds the daily limit.";
                            }

                        } else {
                            reason = "Insufficient balance for withdrawal.";
                        }

                    } else {
                        reason = "Withdrawal amount must be greater than zero.";
                    }

                } else {
                    reason = "Incorrect PIN or PIN must contain exactly 4 digits.";
                }

            } else {
                reason = "Incorrect username.";
            }

            System.out.println("ATM TRANSACTION AUTHORIZER");
            System.out.println("Account Tier: " + accountTier);
            System.out.println("Daily Limit: " + dailyLimit);
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Fee Percentage: " + (feePercentage * 100) + "%");

            if (approved) {
                System.out.println("Status: APPROVED");
            } else {
                System.out.println("Status: DENIED");
            }

            System.out.println("Reason: " + reason);
        }
    }
