package Library;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> bookList = new ArrayList<Book>();

    public static void addBook(Book book) {
        bookList.add(book);
    }

    public static void deleteBook(Book book) {
        bookList.remove(book);
    }

    public static Book getBookByName(String bookName) {
        for (Book book : bookList) ;

        if (bookName == bookName) {
            for (Book book : bookList) {
                if (book.bookName == bookName) {
                    return book;
                }
            }
            return null;

        }
        return null;
    }
}
