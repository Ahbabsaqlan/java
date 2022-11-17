import java.lang.*;
public class BookShop {
    private String name;
    private Book book[];
    public BookShop(){}
    public BookShop(String name,int totalBookNum){
        this.name=name;
        book=new Book[totalBookNum];
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void insertBook(Book a){
        int check=0;
        for(int i=0;i<book.length;i++)
        {
            if(book[i]==null){
                book[i]=a;
                check=1;
                break;
            }
        }
        if(check == 1)
		{
			System.out.println("Book Inserted!");
		}
		else
		{
			System.out.println("Book Dosenot Inserted!");
		}
    }
    public void removeBook(Book a){
        int check=0;
        for(int i=0;i<book.length;i++)
        {
            if(book[i]==a){
                book[i]=null;
                check=1;
                break;
            }
        }
        if(check == 1)
		{
			System.out.println("Book Removed!");
		}
		else
		{
			System.out.println("Book Dosenot Found!");
		}
    }
    public  Book searchBook(String isbn)
	{
		int index=0;
		int check = 0;
		for(int i = 0; i<book.length; i++)
		{
			if(book[i]==null){
			}
			else if(book[i].getIsbn()== isbn)
			{
				index=i;
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Book found!");
		}
		else
		{
			System.out.println("Book not found!");
		}
		return book[index];
	}
    public void showAllBooks()
	{
		for(int i = 0; i<book.length; i++)
		{
			if(book[i]!=null)
			{
				book[i].showDetails();
			}
		}
	}
}
