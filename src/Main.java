import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> itemList = new ArrayList<String>();
    static void addItems() {
        // Add item
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item to add: ");
        String add = input.nextLine();
        // Check if item exist
        for (String i : itemList) {
            if ()
        }
        // Sort list
        // Print list
    }

    static void removeItems() {
        // Remove item
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item to remove: ");
        // Print list
    }

    public static void main(String[] args) {

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("ARRAYLIST CHALLENGE");
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
