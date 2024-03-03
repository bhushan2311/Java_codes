package com.company;
import java.util.Scanner;
abstract class Book2
{
    abstract public void display();
}
class MyBook extends Book2
{
    String title;
    String author;
    int price;
    MyBook(String title,String author,int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }

    @Override
    public void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class Abstract_hackerank_eg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book2 book = new MyBook(title, author, price);
        book.display();
    }
}
