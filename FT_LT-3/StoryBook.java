import java.lang.*;
public class StoryBook extends Book 
{
    public StoryBook(){}
    public StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category)
    {
        super(isbn,bookTitle,authorName,price,availableQuantity);
        this.category=category;
    }

    public void showDetails()
    {
        System.out.println("ISBN: "+getIsbn());
        System.out.println("BookTitle: "+getBookTitle());
        System.out.println("Author Name: "+getAuthorName());
        System.out.println("Price: "+getPrice());
        System.out.println("AvailableQuantity: "+getAvailableQuantity());
        System.out.println("Category: "+category);
    }
}
