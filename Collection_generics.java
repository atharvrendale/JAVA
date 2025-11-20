import java.util.ArrayList;

class Book {
    private int bookID;
    private String bookName;
    private String author;
    private String publisher;
    private int quantity;

    public Book(int bookID, String bookName, String author, String publisher, int quantity) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookID: " + bookID + ", BookName: " + bookName + ", Author: " + author +
                ", Publisher: " + publisher + ", Quantity: " + quantity;
    }
}

public class Collection_generics {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book(101, "Java Programming", "James Gosling", "Sun Microsystems", 50));
        bookList.add(new Book(102, "Data Structures", "Donald Knuth", "Addison-Wesley", 30));
        bookList.add(new Book(103, "Design Patterns", "Erich Gamma", "Addison-Wesley", 20));
        bookList.add(new Book(104, "Algorithms", "Robert Sedgewick", "Addison-Wesley", 40));

        System.out.println("Size of ArrayList: " + bookList.size());

        System.out.println("\nAll Books in the ArrayList:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        Book bookToRemove = bookList.get(1);
        bookList.remove(bookToRemove);

        System.out.println("\nAfter Removing a Book:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
