// The purpose of this program is to use recursion and merges to 
//organize store items by different catagories
//
// By: Jose Reynaldo
// 11/4/23 

public class StoreInventory {
    private static Item[] inventory = new Item[10];

    public static void main(String[] args) {
        inventory[0] = new Item("Chewbacca Mask", 1281, 19.99, 24);
        inventory[1] = new Item("Lightsaber", 4321, 99.99, 10);
        inventory[2] = new Item("Death Star Model", 5678, 499.99, 5);
        inventory[3] = new Item("Stormtrooper Helmet", 9876, 29.99, 15);
        inventory[4] = new Item("Millennium Falcon", 2468, 999.99, 2);
        inventory[5] = new Item("X-wing Fighter", 1357, 299.99, 8);
        inventory[6] = new Item("R2-D2 Figure", 7777, 9.99, 50);
        inventory[7] = new Item("BB-8 Figure", 8888, 14.99, 30);
        inventory[8] = new Item("Darth Vader Mask", 5555, 49.99, 12);
        inventory[9] = new Item("Yoda Plush Toy", 3333, 19.99, 20);

        System.out.println("Inventory before sorting:");
        printInventory();

        System.out.println("\nSorting by product number (ascending):");
        sortByProductNumber(true);
        printInventory();

        System.out.println("\nSorting by product name (ascending):");
        sortByProductName(true);
        printInventory();

        System.out.println("\nSorting by item price (descending):");
        sortByItemPrice(false);
        printInventory();

        System.out.println("\nSorting by product quantity (descending):");
        sortByProductQuantity(false);
        printInventory();
    }

    // Method to print the inventory in a table format
    public static void printInventory() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Name                Product Number      Price          Quantity");
        System.out.println("------------------------------------------------------------------");
        for (Item item : inventory) {
            if (item != null) {
                System.out.println(item);
            }
        }
        System.out.println("------------------------------------------------------------------");
    }

    // Method to sort the inventory by product number
    public static void sortByProductNumber(boolean ascending) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - 1 - i; j++) {
                if ((ascending && inventory[j].getProductNumber() > inventory[j + 1].getProductNumber()) ||
                        (!ascending && inventory[j].getProductNumber() < inventory[j + 1].getProductNumber())) {
                    Item temp = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = temp;
                }
            }
        }
    }

    public static void sortByProductName(boolean ascending) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - 1 - i; j++) {
                if ((ascending && inventory[j].getName().compareToIgnoreCase(inventory[j + 1].getName()) > 0) ||
                        (!ascending && inventory[j].getName().compareToIgnoreCase(inventory[j + 1].getName()) < 0)) {
                    Item temp = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = temp;
                }
            }
        }
    }

    // Method to sort the inventory by item price
    public static void sortByItemPrice(boolean ascending) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - 1 - i; j++) {
                if ((ascending && inventory[j].getPrice() > inventory[j + 1].getPrice()) ||
                        (!ascending && inventory[j].getPrice() < inventory[j + 1].getPrice())) {
                    Item temp = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = temp;
                }
            }
        }
    }

    // Method to sort the inventory by product quantity
    public static void sortByProductQuantity(boolean ascending) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - 1 - i; j++) {
                if ((ascending && inventory[j].getQuantity() > inventory[j + 1].getQuantity()) ||
                        (!ascending && inventory[j].getQuantity() < inventory[j + 1].getQuantity())) {
                    Item temp = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = temp;
                }
            }
        }
    }
}
