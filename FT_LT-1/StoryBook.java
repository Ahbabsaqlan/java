import java.lang.*;
public class StoryBook extends Book 
{
    public StoryBook(){}
    public StoryBook(String isbn,String bookTitle,String bookName,double price,int availableQuantity,String category)
    {
        super(isbn,bookTitle,bookName,price,availableQuantity);
        this.category=category;
    }
}
