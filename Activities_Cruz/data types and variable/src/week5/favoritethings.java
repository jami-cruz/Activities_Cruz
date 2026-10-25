/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Jami
 */
public class favoritethings {
        public static void main(String[] args) {

            String[] favorites = {
                "Cosplaying", "Writing", "Drawing", "Playing Minecraft", "Fashion", "Matcha", "Spending time with friends", 
            };

            System.out.println("MY INTERESTS / FAVORITE THINGS");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            for (int i = 0; i < favorites.length; i++) {
                System.out.println((i + 1) + ". " + favorites[i]);
            }

            System.out.println("Total Favorites: " + favorites.length);
        }
    }
