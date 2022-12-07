import java.lang.*;
public interface IBookShopOperations {
    boolean insertBook(Book a);
    boolean removeBook(Book a);
    void showAllBooks();
    Book searchBook(String isbn);
}
