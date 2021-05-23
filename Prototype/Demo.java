package Prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("JS", "John", 123);
        Book book2 = new Book("Python", "Emma", 456);
        Book book3 = new Book("Java", "John", 156);
        BookStore bookStore = new BookStore();
        bookStore.setName("X Store");
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);
        Book book4 = new Book("AI", "John", 156);
        BookStore bookStore1 = bookStore.clone();
        bookStore1.addBook(book4);
        bookStore.printBooks();
        System.out.println("+++++++++++");
        bookStore1.printBooks();
        bookStore1.setName("y name");
        System.out.println(bookStore.getName());
    }
}
