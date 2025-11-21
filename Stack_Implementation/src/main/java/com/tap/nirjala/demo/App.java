package com.tap.nirjala.demo;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Shelf shelf=new Shelf();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
               
                 case 1: {
                    System.out.print("Enter The Book Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter The Author Name: ");
                    String author=sc.nextLine();
                    Books book=new Books(name, author);
                    shelf.push(book);
                    break;
                }

                case 2:{
                    shelf.pop();
                    break;
                }
                case 3:{
                    shelf.display();
                    break;
                }
                case 4:{
                    System.out.println("Enter the index pick "+shelf.top);
                    int index=sc.nextInt();
                    shelf.peek(index);
                    break;
                }
                case 5:
                System.out.println("Something wrong....  :(");
            default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}


//         shelf1.push(book1);
//         shelf1.push(book2);
//         shelf1.push(book3);
//         shelf1.push(book4);
//         shelf1.push(book5);

//         System.out.println("********************************************");
//         shelf1.display();
//         System.out.println("********************************************");
//         shelf1.pop();
//         System.out.println("********************************************");
//         shelf1.display();
//         System.out.println("********************************************");
//         shelf1.peek(4);
        
//     }
// }