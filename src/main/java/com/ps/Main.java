package com.ps;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[20];

        books[0] = new Book(1, "1234567890", "Java Programming", false, "");
        books[1] = new Book(2, "0987654321", "Introduction to Algorithms", true, "John Doe");
        books[2] = new Book(3, "5432109876", "Data Structures and Algorithms in Java", false, "");
        books[3] = new Book(4, "9876543210", "Clean Code: A Handbook of Agile Software Craftsmanship", false, "");
        books[4] = new Book(5, "1357924680", "Design Patterns: Elements of Reusable Object-Oriented Software", true, "Jane Smith");
        books[5] = new Book(6, "2468013579", "Head First Java", false, "");
        books[6] = new Book(7, "9876543211", "Effective Java", true, "Michael Johnson");
        books[7] = new Book(8, "1122334455", "Cracking the Coding Interview", false, "");
        books[8] = new Book(9, "9988776655", "Programming Pearls", true, "Alice Williams");
        books[9] = new Book(10, "1231231234", "The Pragmatic Programmer", false, "");
        books[10] = new Book(11, "4564564567", "Refactoring: Improving the Design of Existing Code", false, "");
        books[11] = new Book(12, "7897897890", "Algorithms", true, "Bob Brown");
        books[12] = new Book(13, "6546546543", "Java Concurrency in Practice", false, "");
        books[13] = new Book(14, "9876543212", "Code Complete: A Practical Handbook of Software Construction", true, "Chris Lee");
        books[14] = new Book(15, "1010101010", "Domain-Driven Design", false, "");
        books[15] = new Book(16, "1212121212", "Clean Architecture: A Craftsman's Guide to Software Structure and Design", false, "");
        books[16] = new Book(17, "1414141414", "Test Driven Development: By Example", true, "David Miller");
        books[17] = new Book(18, "1616161616", "The Mythical Man-Month", false, "");
        books[18] = new Book(19, "1818181818", "Patterns of Enterprise Application Architecture", false, "");
        books[19] = new Book(20, "1919191919", "Thinking in Java", true, "Emily Jones");

//        for (Book book : books) {
//            System.out.println(book);
//        }

        int command;
        // Check out books

        do {
            //Home Screen
            System.out.println("Welcome to the Neighborhood Library");
            System.out.println("Please choose from the following options: ");
            System.out.println("\t1) Show Available Books");
            System.out.println("\t2) Show Checked Out Books");
            System.out.println("\t3) Exit");

            Scanner scanner = new Scanner(System.in);
            command = scanner.nextInt();



            switch (command) {
                case 1:
                    System.out.println("Show all available books");
                    // show available books
                   showAvailableBooks(books);
                    break;

                case 2:
//                    System.out.println("Check out a book");
                    showCheckedOutBooks(books);
                    checkInBook(books);
                    break;

                case 3:

                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;

            }
            if (command == 1 ){
                int checkOutCommand;
                do{
                    System.out.println("Please choose from the following options: ");
                    System.out.println("\t1) Check out a book");
                    System.out.println("\t2  Check in a book");
                    System.out.println("\t3) Go back to Home Screen");

                    checkOutCommand = scanner.nextInt();

                   switch (checkOutCommand){
                       case 1:
                           checkOutBook(books);
                           break;
                       case 2:
                           System.out.println("Going back to the Home Screen");
                           break;

                       default:
                           System.out.println("Invalid option. Please try again.");
                           break;
                   }
                } while (checkOutCommand !=2);

            }

        }while (command !=3);
    }

    private static void showAvailableBooks(Book[] books) {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.getIsCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
            }
        }
    }

    public static void showCheckedOutBooks(Book[] books){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Checked Out Books: ");

        for (Book book : books){
            if (book.getIsCheckedOut()){
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + "Borrower: " + book.getCheckedOutTo());

            }
        }
    }

    private static void checkOutBook(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the book you want to check out:");
        int bookId = scanner.nextInt();

        scanner.nextLine();

        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.getIsCheckedOut()) {
                    book.setCheckedOut(true);

                    System.out.println("\nEnter your name: ");
                    String borrower = scanner.nextLine();
                    book.setCheckedOutTo(borrower.toUpperCase());

                    System.out.println("\n(C)heck out");
                    System.out.println("\n(X)- Return to the Home Screen");
                    String option = scanner.nextLine();

                    if (option.equalsIgnoreCase("C")){
                        System.out.println("\nBook checked out successfully " + borrower +" !");
                        String space = scanner.nextLine();
                    } else if (option.equalsIgnoreCase("X")) {
                        System.out.println("\n(X)- Returning to the Home Screen");
                        break;
                    } else {
                        System.out.println("\nInvalid option.");
                    }
                } else {
                    System.out.println("\nThis book is already checked out.");
                }
                return;
            }
        }
        System.out.println("\nBook with ID " + bookId + " not found or chosen.");
    }
    public static void checkInBook(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to check in your book? (C/X) C-CheckIn X-Home");
        scanner.nextLine();

        String choice = scanner.nextLine().toUpperCase();

        if (choice.equals("C")) {
            System.out.println("Enter the ID of the book you want to check in:");
            int bookId = scanner.nextInt();

            boolean found = false;

            for (Book book : books) {
                if (book.getId() == bookId) {
                    found = true;
                    if (book.getIsCheckedOut()) {
                        book.setCheckedOut(false);
                        book.setCheckedOutTo("");
                        System.out.println("\nBook checked in successfully!");
                    } else {
                        System.out.println("\nThis book is not checked out.");
                    }
                    break;
                }
            }
        } else if (choice.equals("X")) {
            System.out.println("Returning to the Home Screen.");
        } else {
            System.out.println("Invalid option. Returning to the Home Screen.");
        }
    }

    }
