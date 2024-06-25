package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private String name;

    ArrayList<Book> myListOfBooks = new ArrayList<Book>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBook() {
        Scanner scan = new Scanner(System.in);
        Book book = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), Integer.parseInt(scan.nextLine()));
        myListOfBooks.add(book);
    }

    public void search(String name) {

        for (int i = 0; i < myListOfBooks.size(); i++) {
            Book book = myListOfBooks.get(i);
            if (book.getAuthor().equals(name)) {
                System.out.println(book);
            }
        }

    }

    public void removeBook(String name) {

        for (int i = 0; i < myListOfBooks.size(); i++) {
            Book book = myListOfBooks.get(i);
            if (book.getTitle().equals(name)) {
               myListOfBooks.remove(book);
                System.out.println("The book was remove");
            }
        }

    }


    public void removeBookByAuthor(String name) {

        for (int i = 0; i < myListOfBooks.size(); i++) {
            Book book = myListOfBooks.get(i);
            if (book.getAuthor().equals(name)) {
               myListOfBooks.remove(book);
                System.out.println("The book was remove");
            }
        }

    }

    public void printBook(){
        for (int i = 0; i < myListOfBooks.size(); i++) {
            System.out.println(myListOfBooks.get(i));
        }
    }






}

