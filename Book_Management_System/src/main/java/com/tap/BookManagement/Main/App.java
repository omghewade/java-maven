package com.tap.BookManagement.Main;

import java.util.*;
import com.tap.BookManagement.Entity.Bookrecord;
import com.tap.BookManagement.Repository.BookAdmin;
import com.tap.BookManagement.Ui.Uimanager;

public class App {
    static final String ADMIN_USERNAME = "admin";
    static final String ADMIN_PASSWORD = "admin";

    static final String USER_USERNAME = "user";
    static final String USER_PASSWORD = "user";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Uimanager uiManager = new Uimanager();
        BookAdmin bookAdmin = new BookAdmin();
        Bookrecord bookRecord = new Bookrecord(1, "Sample Book", "Author Name", "Publisher Name", "English",
                "Description of the book");
        System.out.println("Select Role:");
        System.out.println("1) Admin");
        System.out.println("2) User");
        System.out.print("Enter your choice: ");
        int roleChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (roleChoice == 1 && username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Admin login successful!");
            adminMenu(scanner);
        } else if (roleChoice == 2 && username.equals(USER_USERNAME) && password.equals(USER_PASSWORD)) {
            System.out.println("User login successful!");
            userMenu(scanner);
        } else {
            System.out.println("Invalid credentials or role selected.");
        }

        scanner.close();
    }

    // Admin menu
    public static void adminMenu(Scanner scanner) {
        BookAdmin bookAdmin = new BookAdmin();
        while (true) {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1) Add Record");
            System.out.println("2) Delete Record");
            System.out.println("3) Update Record");
            System.out.println("4) Search by ID");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Enter book details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Language: ");
                    String language = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    bookAdmin.addrecord(new Bookrecord(id, title, author, publisher, language, description));
                    System.out.println("Record added successfully!");

                    System.out.println("Adding record...");
                    break;
                case 2:
                    System.out.print("Enter the ID of the record to delete: ");
                    int deleteId = scanner.nextInt();

                    bookAdmin.deleterecord(deleteId);

                    System.out.println("Deleting record...");
                    break;
                case 3:
                    System.out.print("Enter the ID of the record to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter new publisher: ");
                    String newPublisher = scanner.nextLine();
                    System.out.print("Enter new language: ");
                    String newLanguage = scanner.nextLine();
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();

                    bookAdmin.updaterecord(updateId,
                            new Bookrecord(updateId, newTitle, newAuthor, newPublisher, newLanguage, newDescription));
                    System.out.println("Updating record...");

                    break;
                case 4:
                    System.out.print("Enter the ID to search: ");
                    int searchId = scanner.nextInt();
                    Bookrecord foundRecord = bookAdmin.searchbyid(searchId);
                    if (foundRecord != null) {
                        System.out.println("Book found: " + foundRecord);
                    } else {
                        System.out.println("Book with ID " + searchId + " not found.");
                    }

                    System.out.println("Searching by ID...");
                    break;
                case 5:
                    System.out.println("Exiting admin menu.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    // User menu
    public static void userMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n=== User Menu ===");
            System.out.println("1) Read Book");
            System.out.println("2) Write Book");
            System.out.println("3) Search by Record");
            System.out.println("4) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Reading book...");
                    break;

                case 2:
                    System.out.println("Writing book...");
                    break;
                case 3:
                    System.out.println("Searching by record...");
                    break;
                case 4:
                    System.out.println("Exiting user menu.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}