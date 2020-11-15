package Library;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class MainLibrary {
    private static List<Book> bookList = new ArrayList<Book>();

    public static void addBook(Book book)
    {
        bookList.add(book);
    }

    public static void deleteBook( Book book)
    {
        bookList.remove(book);
    }

    public static Book getBookByName(String bookName) {
        return null;
    }

    {
        for (Book book : bookList)
        {
            if (book.bookName == bookName){
                return book;
            }
        }

        return null;
    }

    public static List<Book> getBooks()
    {
        return bookList;
    }

}
