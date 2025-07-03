package com.tap.BookManagement.Ui;

public class Uimanager {

    public void displayAdminMenu() {
        System.out.println("\n=== Admin Menu ===");
        System.out.println("1) Add Record");
        System.out.println("2) Delete Record");
        System.out.println("3) Update Record");
        System.out.println("4) Search by ID");
        System.out.println("5) Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayUserMenu() {
        System.out.println("\n=== User Menu ===");
        System.out.println("1) Search by ID");
        System.out.println("2) Exit");
        System.out.print("Enter your choice: ");
    }

    public void displaySearchByIdPrompt() {
        System.out.print("Enter the ID to search: ");
    }
    public void displayExitMessage() {
        System.out.println("Exiting the application. Goodbye!");
    }
    public void displayInvalidOptionMessage() {
        System.out.println("Invalid option. Please try again.");
    }
    public void displayRecordNotFoundMessage(int id) {
        System.out.println("Book with ID " + id + " not found.");
    }
    public void displayRecordDeletedMessage() {
        System.out.println("Book record deleted successfully!");
    }

    public void displayRecordUpdatedMessage() {
        System.out.println("Book record updated successfully!");
    }
    
    
}
