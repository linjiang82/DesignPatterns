package Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements IPrototype{
    //the books may fetch from database and will take a while
    //so the prototype is used to facilitate construct objects.
    private List<Book> books = new ArrayList<>();
    private String name;

    public void addBook(Book book){
        books.add(book);
    }
    public void printBooks(){
        for(Book book: books){
            System.out.println(book.getName());
        }
    }
    public List<Book> getBooks(){
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    //Todo: should be a deep clone
    public BookStore clone() throws CloneNotSupportedException {
        return (BookStore) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
