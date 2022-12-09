import java.lang.*;
public class TextBook extends Book
{   
    public int standard;

    public TextBook(){}
    public TextBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,int standard)
    {
        super(isbn,bookTitle,authorName,price,availableQuantity);
        this.standard=standard;
    }

    public void setStandard(int standard)
    {
        this.standard=standard;
    }
    public int getStandard()
    {
        return standard;
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
