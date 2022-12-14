package com.bookshelf;

public class Book {
    private String author;
    private String name;
    private int year;
    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return author + " " + name + " " + year;
    }
}
