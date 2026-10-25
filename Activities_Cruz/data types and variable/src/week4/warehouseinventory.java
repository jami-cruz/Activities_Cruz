/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author Jami
 */

public class warehouseinventory {

    public static void main(String[] args) {

            int[][] inventory = {
                {10, 15, 20},
                {8, -1, 12},
                {5, 3, 7}
            };

            int choice;

            do {
                System.out.println("\n===== WAREHOUSE INVENTORY SCANNER =====");
                System.out.println("1. Display Inventory");
                System.out.println("2. Calculate Total Inventory");
                System.out.println("3. Find First Critically Low Shelf");
                System.out.println("4. Restock Shelf");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = input.nextInt();

                switch (choice) {

                    case 1 -> displayInventory(inventory);

                    case 2 -> calculateTotal(inventory);

                    case 3 -> findCriticalShelf(inventory);

                    case 4 -> restockShelf(inventory);

                    case 5 -> System.out.println("Exiting inventory scanner...");

                    default -> System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 5);

            input.close();
        }

        public static void displayInventory(int[][] inventory) {

            System.out.println("\n===== INVENTORY =====");

        for (int[] inventory1 : inventory) {
            for (int col = 0; col < inventory1.length; col++) {
                System.out.print(inventory1[col] + "\t");
            }
            System.out.println();
        }
        }

        public static void calculateTotal(int[][] inventory) {

            int total = 0;

        for (int[] inventory1 : inventory) {
            for (int col = 0; col < inventory1.length; col++) {
                if (inventory1[col] == -1) {
                    continue;
                }
                total += inventory1[col];
            }
        }

            System.out.println("Total Inventory: " + total);
        }

        public static void findCriticalShelf(int[][] inventory) {

            boolean found = false;

            for (int row = 0; row < inventory.length; row++) {

                for (int col = 0; col < inventory[row].length; col++) {

                    if (inventory[row][col] >= 0 && inventory[row][col] <= 5) {
                        System.out.println(
                                "First critically low shelf found at Row "
                                + (row + 1) + ", Column " + (col + 1)
                                + " | Quantity: " + inventory[row][col]
                        );

                        found = true;
                        break;
                    }
                }

                if (found) {
                    break;
                }
            }

            if (!found) {
                System.out.println("No critically low shelves found.");
            }
        }

        public static void restockShelf(int[][] inventory) {

            System.out.print("Enter row number (1-" + inventory.length + "): ");
            int row = input.nextInt();

            System.out.print("Enter column number (1-" + inventory[0].length + "): ");
            int col = input.nextInt();

            if (row < 1 || row > inventory.length
                    || col < 1 || col > inventory[0].length) {

                System.out.println("Invalid shelf location.");
                return;
            }

            // Damaged shelves cannot be restocked
            if (inventory[row - 1][col - 1] == -1) {
                System.out.println("Cannot restock a damaged shelf.");
                return;
            }

            int quantity;

            while (true) {

                System.out.print("Enter restock quantity (greater than 0): ");
                quantity = input.nextInt();

                if (quantity > 0) {
                    break;
                }

                System.out.println("Invalid quantity. Try again.");
            }

            inventory[row - 1][col - 1] += quantity;

            System.out.println("Restocking successful.");
            System.out.println(
                    "Updated quantity: " + inventory[row - 1][col - 1]
            );
        }
    }
