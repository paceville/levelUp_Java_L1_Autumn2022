package org.levelup.homework5.task3;

import java.util.Arrays;

public class Reader {
    String firstName, lastname, libraryCardNumber;
    Faculty faculty;
    long dateOfBirthday, phoneNumber;

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastname() {
        return this.lastname;
    }

    public Reader(String firstName, String lastname, String libraryCardNumber, Faculty faculty, long dateOfBirthday, long phoneNumber) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirthday = dateOfBirthday;
        this. phoneNumber = phoneNumber;
    }

    public Reader() {}

    enum Faculty {
        GRYFFINDOR,
        HUFFLEPUFF,
        RAVENCLAW,
        SLYTHERIN
    }

    public void takeBook(int countOfBooks) {
        System.out.println(getFirstName() + " " + getLastname() + " took " + countOfBooks + " books");
    }

    public void takeBook(String[] books) {
        System.out.println(getFirstName() + " " + getLastname() + " took the following books: " + Arrays.toString(books));
    }

    public void takeBook(Book[] books) {
        System.out.print(getFirstName() + " " + getLastname() + " took the following books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getNameOfTheBook() + ", " + books[i].getBookAuthor() + "; ");
        }
        System.out.println();
    }

    public void returnBook(int countOfBooks) {
        System.out.println(getFirstName() + " " + getLastname() + " returned " + countOfBooks + " books");
    }

    public void returnBook(String[] books) {
        System.out.println(getFirstName() + " " + getLastname() + " returned the following books: " + Arrays.toString(books));
    }

    public void returnBook(Book[] books) {
        System.out.print(getFirstName() + " " + getLastname() + " returned the following books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getNameOfTheBook() + ", " + books[i].getBookAuthor() + "; ");
        }
        System.out.println();
    }

    public void studentsList(Reader[] students) {
        System.out.print("Students: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].getFirstName() + " " + students[i].getLastname() + "; ");
        }
        System.out.println();
    }
}
