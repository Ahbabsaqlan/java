import java.lang.*;
public class TextBook extends Book
{   
    public TextBook(){}
    public TextBook(String isbn,String bookTitle,String bookName,double price,int availableQuantity,int standard)
    {
        super(isbn,bookTitle,bookName,price,availableQuantity);
        this.standard=standard;
    }
}
