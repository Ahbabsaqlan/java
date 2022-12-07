import java.lang.*;
public class TextBook extends Book
{   
    public TextBook(){}
    public TextBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,int standard)
    {
        super(isbn,bookTitle,authorName,price,availableQuantity);
        this.standard=standard;
    }

    public void showDetails()
    {
        System.out.println("ISBN: "+getIsbn());
        System.out.println("BookTitle: "+getBookTitle());
        System.out.println("Author Name: "+getAuthorName());
        System.out.println("Price: "+getPrice());
        System.out.println("AvailableQuantity: "+getAvailableQuantity());
        System.out.println("Standard: "+standard);
    }
}
