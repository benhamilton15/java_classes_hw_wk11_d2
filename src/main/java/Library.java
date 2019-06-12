import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < capacity) {
            this.books.add(book);
        }
    }
}
