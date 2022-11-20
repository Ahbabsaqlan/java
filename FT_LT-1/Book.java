import java.lang.*;
public class Book
{
    private String isbn;
    private String bookTitle;
    private String bookName;
    private double price;
    private int availableQuantity;
    protected int standard;
    protected String category;
    public Book(){}
    public Book(String isbn,String bookTitle,String bookName,double price,int availableQuantity)
    {
        this.isbn=isbn;
        this.bookTitle=bookTitle;
        this.bookName=bookName;
        this.price=price;
        this.availableQuantity=availableQuantity;
    }
    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }
    public void setBookTitle(String bookTitle)
    {
        this.bookTitle=bookTitle;
    }
    public void setBookName(String bookName)
    {
        this.bookName=bookName;
    }
    public void setPrice(Double price)
    {
        this.price=price;
    }
    public void setAvailableQuantity(int availableQuantity)
    {
        this.availableQuantity=availableQuantity;
    }
    public void setStandard(int standard)
    {
        this.standard=standard;
    }
    public void setCategory(String category)
    {
        this.category=category;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public String getBookTitle()
    {
        return bookTitle;
    }
    public String getBookName()
    {
        return bookName;
    }
    public double getPrice()
    {
        return price;
    }
    public int getAvailableQuantity()
    {
        return availableQuantity;
    }
    public int getStandard()
    {
        return standard;
    }
    public String getCategory()
    {
        return category;
    }
    public void addQuantity(int amount)
    {
        this.availableQuantity+=amount;
        System.out.println("Books Added Successfully");
    }
    public void sellQuantity(int amount)
    {
        this.availableQuantity-=amount;
        System.out.println("Books Sold Successfully");
    }
    public void showDetails()
    {
        System.out.println("ISBN: "+isbn);
        System.out.println("BookTitle: "+bookTitle);
        System.out.println("BookName: "+bookName);
        System.out.println("Price: "+price);
        System.out.println("AvailableQuantity: "+availableQuantity);
        if(standard==0){
        }
        else{
            System.out.println("BookType: TextBook");
            System.out.println("Standard: "+standard);
        }
        if(category==null){
        }
        else{
            System.out.println("BookType: StoryBook");
            System.out.println("Category: "+category);
        }
    }
}