/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Jami
 */
public class loginvalidator {
    
        public static void main(String[] args) {

            String correctUsername = "jammieeccruz";
            String correctPassword = "071107";
            boolean isLocked = false;

            String username = "jammieeccruz";
            String password = "071106";

            System.out.println("NESTED LOGIN VALIDATOR");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            
            if (username.equals(correctUsername)) {

                if (password.equals(correctPassword)) {

                    if (!isLocked) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Login failed: Account is locked.");
                    }

                } else {
                    System.out.println("Login failed: Incorrect password.");
                }

            } else {
                System.out.println("Login failed: Incorrect username.");
            }
        }
    }

