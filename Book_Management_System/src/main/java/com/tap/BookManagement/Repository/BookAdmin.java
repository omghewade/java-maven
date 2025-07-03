package com.tap.BookManagement.Repository;

import com.tap.BookManagement.Entity.Bookrecord;
import java.util.ArrayList;

public class BookAdmin {

    ArrayList<Bookrecord> bookRecords = new ArrayList<Bookrecord>();

    public void addrecord(Bookrecord book)

    {
        bookRecords.add(book);
    }

    public void Updaterecord(int id) {
        for (Bookrecord book : bookRecords) {

            if (book.getId() == id) {

                System.out.println("enter the new book title\n");
                String newtitle = System.console().readLine();
                book.setTitle(newtitle);

                System.err.println("enter the book Author");
                String newauthor = System.console().readLine();
                book.setAuthor(newauthor);

                System.out.println("enter the book publisher");
                String newpublisher = System.console().readLine();
                book.setPublisher(newpublisher);

                System.out.println("enter the book language");
                String newlanguage = System.console().readLine();
                book.setLanguage(newlanguage);

                System.out.println("enter the book description");
                String newdescription = System.console().readLine();
                book.setDescription(newdescription);
                System.out.println("Book record updated successfully!");
                return;
            } else {
                System.out.println("Book with ID " + id + " not found.");
                return;

            }

        }
    }

    public void deleterecord(int id) {
        for (Bookrecord book : bookRecords) {
            if (book.getId() == id) {
                bookRecords.remove(book);
                System.out.println("Book record deleted successfully!");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");

    }

    public Bookrecord searchbyid(int id) {
        for (Bookrecord book : bookRecords) {
            if (book.getId() == id) {
                System.out.println("Book found: " + book);
                return book;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
        return null;
    }

    public void displayAllRecords() {
        if (bookRecords.isEmpty()) {
            System.out.println("No book records available.");
        } else {
            for (Bookrecord book : bookRecords) {
                System.out.println(book);
            }
        }
    }

    public ArrayList<Bookrecord> getBookRecords() {
        return bookRecords;
    }

    public void setBookRecords(ArrayList<Bookrecord> bookRecords) {
        this.bookRecords = bookRecords;
    }

    public void updaterecord(int updateId, Bookrecord bookrecord) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updaterecord'");
    }

}
