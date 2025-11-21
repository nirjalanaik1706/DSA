package com.tap.nirjala.demo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data;

        do {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the data to insert: ");
                    data = sc.nextInt();
                    l.insert(data);
                    break;
                }
                case 2: {
                    System.out.print("Enter the data to delete: ");
                    data = sc.nextInt();
                    l.delete(data);
                    break;
                }
                case 3: {
                    System.out.print("Enter the data to search: ");
                    data = sc.nextInt();
                    l.search(data);
                    break;
                }
                case 4: {
                    System.out.println("Displaying the list:");
                    l.display();
                    break;
                }
                case 5: {
                    System.out.println("Exit");
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}
