package com.gla.objectandclasses.level3;

public class EBook {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {

        EBook e = new EBook("ISBN101", "Java Programming", "James Gosling");

        e.setAuthor("Uttkarsh");

        e.display();
    }

}
