package com.tap.nirjala.demo;
public class App 
{
    public static void main( String[] args )
    {
        Shelf shelf1=new Shelf();

        Books book1=new Books("Narayan Murti", "A Bettter India ,A Better World");
        Books book2=new Books("APJ Kalam","Wings of Fire");
        Books book3=new Books("Achyut Godbole","Infotech");
        Books book4=new Books("Nandan Nilekani","Imagining India");
        Books book5=new Books("BR Ambedkar","Buddha and his Dhamma");

        shelf1.push(book1);
        shelf1.push(book2);
        shelf1.push(book3);
        shelf1.push(book4);
        shelf1.push(book5);

        System.out.println("********************************************");
        shelf1.display();
        System.out.println("********************************************");
        shelf1.pop();
        System.out.println("********************************************");
        shelf1.display();
        System.out.println("********************************************");
        shelf1.peek(4);
        
    }
}