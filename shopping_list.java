import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String[] shoppingList = new String[5];
        int itemCount = 0;

        System.out.println("\nEnter the number of items to add to your shopping list (max 5):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter item # " + (i + 1) + ": ");
            String item = scnr.nextLine().trim();

            if (item.isEmpty()) {
                break;
            }

            shoppingList[itemCount] = item;
            itemCount++;
        }

        System.out.println("\nYour Shopping List:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(">> " + shoppingList[i]);
    }

    System.out.print("\nEnter item to search for: ");
        String searchItem = scnr.nextLine().trim();
        
        boolean found = false;
        
        for (int i = 0; i < itemCount; i++) {
            if (shoppingList[i].equalsIgnoreCase(searchItem)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchItem + " is in your shopping list.");
        } else {
            System.out.println(searchItem + " is not in your shopping list.");
        }
        scnr.close();
    }
}
