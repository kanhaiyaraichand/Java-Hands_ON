Q4) Create a Book class with variables {id, name, book author,
publisher ,price & quantity} and add all the book object to your
collection and find out the high cost books names and the
quantity and also find out the book which is written by the author
“Galvin” note: user will enter the data at runtime
Hands On Assignment 14 Feb. 22
//Provided model
class Book implements Comparable<Book> {
 int id;
 String name, publisher;
 int quantity;
 int price;
 public Book(int id, String name, String publisher, int quantity, int
price) {
 this.id = id;
 this.name = name;
 this.publisher = publisher;
 this.quantity = quantity;
 this.price = price;
 }
 @Override
 public int compareTo(Book o) {
 if (quantity > o.quantity) {
 return 1;
 } else if (quantity < o.quantity) {
 return -1;
 }
 return 0;}}
//Main class
public class TreeSetDemo {
 public static void main(String[] args) {
 Book b1 = new Book(101, "Core Java", "Galvin", 30, 300);
 Book b2 = new Book(102, "Advance Java", "Galvin", 25, 450);
 Book b3 = new Book(102, "add more..", "Set_it", 255, 4500);
 }

Ans.

package com.org.gen.14thfebHandsOn


import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

class Book implements Comparable<Book> {
    int id;
    String name, publisher;
    int quantity;
    int price;
    public Book(int id, String name, String publisher, int quantity, int
            price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.quantity = quantity;
        this.price = price;
    }
    @Override
    public int compareTo(Book o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public String getPublisher() {
        return this.publisher;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books you want to enter : ");
        int n = sc.nextInt();
        ArrayList<Book> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the book id : ");
            int id = sc.nextInt();
            System.out.print("Enter the book name : ");
            String name = sc.next();sc.next();
            System.out.print("Enter the publisher name : ");
            String publisher = sc.next();sc.next();
            System.out.print("Enter the quantity of books : ");
            int quantity = sc.nextInt();
            System.out.print("Enter the price : ");
            int price = sc.nextInt();
            b.add(new Book(id,name,publisher,quantity,price));

        }
        Collections.sort(b);
//       Printing book which has the highest cost.
        System.out.println(b.get(0));

//      Printing the book having the publisher name as Galvin.
        for (Book bObj: b){
            if(bObj.getPublisher().toLowerCase(Locale.ROOT).equals("Galvin".toLowerCase(Locale.ROOT)))
                System.out.println(bObj);
        }

    }
}