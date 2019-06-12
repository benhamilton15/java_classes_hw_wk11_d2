import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book("Bible", "Jesus", "Religion");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
    }
    @Test
    public void wontAddBookIfAtCapacity(){
        library = new Library(1);
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
}
