package org.levelup.homework5.task3;

public class Book {
    String nameOfTheBook, bookAuthor;

    public String getNameOfTheBook() {
        return this.nameOfTheBook;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public Book(String nameOfTheBook, String bookAuthor) {
        this.nameOfTheBook = nameOfTheBook;
        this.bookAuthor = bookAuthor;
    }
}
