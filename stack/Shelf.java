import java.util.Scanner;

public class Shelf {
    public int top;
    public int size=10;
    public Book book[];

    public Shelf() {
        top=-1;
        book=new Book[size];
    }
    void push(Book theBook)
    {
        if(top<size){
            top++;
            book[top]=theBook;
        }
    }

    Book pop()
    {
        if (top==-1){
            System.out.println("Stack is empty");
        }
        Book b1=book[top];
        top--;
        return b1;
    }
    void display(){
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("--------Menu--------");
        System.out.println("1.Display by id ");
        System.out.println("2.Display all books");
        System.out.println("Enter your choice");
        choice=sc.nextInt();

        switch (choice) {
            case 1:{
                int id;
                System.out.println("Enter id");
                id=sc.nextInt();
                System.out.println(book[id-1].title+"by"+book[id-1].author);
                break;
            }

            case 2:{
                for (int i = top; i >-1;i--) {
                 System.out.println("id"+book[i].id+"title:"+book[i].title+"author"+book[i].author);   
                }
                break;
            }
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
