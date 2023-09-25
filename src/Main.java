import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<String> itemList = new ArrayList<String>(10);
    static void addItems() {
        // Add item
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item to add: ");
        String add = input.nextLine();
        for (int i = 0; i < itemList.size(); i++) { // Check if item exist
            if (add.equalsIgnoreCase(itemList.get(i))) {
                System.out.println("Item already exists!");
                itemList.remove(i);
                break;
            }
        }
        itemList.add(add);

        // Sort list
        Collections.sort(itemList);
        // Print list
        System.out.println("ITEM LIST");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i));
        }
    }

    static void removeItems() {
        // Show list
        System.out.println("ITEM LIST");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i));
        }
        // Remove item
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item to remove: ");
        itemList.remove(input.nextLine());
        // Sort list
        Collections.sort(itemList);
        // Print list
        System.out.println("ITEM LIST");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nARRAYLIST CHALLENGE");
            System.out.println("0. Shutdown");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");

            String choice = input.nextLine();
            switch (choice) {
                case "0":
                    isRunning = false;
                    break;
                case "1":
                    addItems();
                    break;
                case "2":
                    removeItems();
                    break;
            }
        }
    }
}
