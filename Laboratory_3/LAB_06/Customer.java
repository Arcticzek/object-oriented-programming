import java.util.ArrayList;

public class Customer {
    private final String name;
    private final ArrayList<Book> books;

    public Customer(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
