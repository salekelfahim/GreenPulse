package com.green;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create");
            System.out.println("2. Edit");
            System.out.println("3. Dispaly");
            System.out.println("4. Delete");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter First name: ");
                    String firstname = scanner.nextLine();
                    System.out.print("Enter Last name: ");
                    String lastname = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    String id = scanner.nextLine();
                    User.createUser(firstname, lastname, age, id);
                    break;
                case 2:
                    System.out.print("Enter user ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new First name: ");
                    firstname = scanner.nextLine();
                    System.out.print("Enter new Last name: ");
                    lastname = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    age = scanner.nextInt();
                    scanner.nextLine();
                    User.update(id, firstname, lastname, age);
                    break;
                case 3:
                    System.out.print("Enter user ID: ");
                    id = scanner.nextLine();
                    User.displayUser(id);
                    break;
                case 4:
                    System.out.print("Enter user ID: ");
                    id = scanner.nextLine();
                    User.delete(id);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}