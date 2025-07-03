package com.tap.BookManagement.Entity;

public class Bookrecord {

     private int id;
     private String title;
     private String author;
     private String publisher;
     private String language;
     private String description;

    public Bookrecord(int id , String title, String author, String publisher, String language, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.language = language;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;    
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Bookrecord{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", language='" + language + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
