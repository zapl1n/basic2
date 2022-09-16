package week6;

import java.util.ArrayList;

public class Libary {
    private ArrayList<Book> books;

    public Libary() {
        this.books = new ArrayList<Book>();
    }
    public void addBook(Book newBook){
        this.books.add(newBook);
    }
    public void printBooks(){
        for (Book book: this.books){
            System.out.println(book);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book: this.books){
            if(book.title().equals(title)){
                found.add(book);

            }
        }
        return found;
    }
}
