package com.ps;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[20];

        books[0] = new Book(1, "ISBN-1234567890", "Java Programming", false, "");
        books[1] = new Book(2, "ISBN-0987654321", "Introduction to Algorithms", true, "John Doe");
        books[2] = new Book(3, "ISBN-5432109876", "Data Structures and Algorithms in Java", false, "");
        books[3] = new Book(4, "ISBN-9876543210", "Clean Code: A Handbook of Agile Software Craftsmanship", false, "");
        books[4] = new Book(5, "ISBN-1357924680", "Design Patterns: Elements of Reusable Object-Oriented Software", true, "Jane Smith");
        books[5] = new Book(6, "ISBN-2468013579", "Head First Java", false, "");
        books[6] = new Book(7, "ISBN-9876543211", "Effective Java", true, "Michael Johnson");
        books[7] = new Book(8, "ISBN-1122334455", "Cracking the Coding Interview", false, "");
        books[8] = new Book(9, "ISBN-9988776655", "Programming Pearls", true, "Alice Williams");
        books[9] = new Book(10, "ISBN-1231231234", "The Pragmatic Programmer", false, "");
        books[10] = new Book(11, "ISBN-4564564567", "Refactoring: Improving the Design of Existing Code", false, "");
        books[11] = new Book(12, "ISBN-7897897890", "Algorithms", true, "Bob Brown");
        books[12] = new Book(13, "ISBN-6546546543", "Java Concurrency in Practice", false, "");
        books[13] = new Book(14, "ISBN-9876543212", "Code Complete: A Practical Handbook of Software Construction", true, "Chris Lee");
        books[14] = new Book(15, "ISBN-1010101010", "Domain-Driven Design", false, "");
        books[15] = new Book(16, "ISBN-1212121212", "Clean Architecture: A Craftsman's Guide to Software Structure and Design", false, "");
        books[16] = new Book(17, "ISBN-1414141414", "Test Driven Development: By Example", true, "David Miller");
        books[17] = new Book(18, "ISBN-1616161616", "The Mythical Man-Month", false, "");
        books[18] = new Book(19, "ISBN-1818181818", "Patterns of Enterprise Application Architecture", false, "");
        books[19] = new Book(20, "ISBN-1919191919", "Thinking in Java", true, "Emily Jones");

//        for (Book book : books) {
//            System.out.println(book);
//        }

        int command;
        do {
            System.out.println("Please choose from the following options: ");
            System.out.println("\t1) Show Available Books");
            System.out.println("\t2) Show Checked Out Books");
            System.out.println("\t3) Exit");

            Scanner scanner = new Scanner(System.in);
            command = scanner.nextInt();

            switch (command){

            }
        }
    }
}