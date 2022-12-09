import java.lang.*;
public class BookShop implements IBookShopOperations
{
    private String name;
    private Book listOfBooks[];

    public BookShop(){}
    public BookShop(String name,int totalBookNum)
	{
        this.name=name;
        listOfBooks=new Book[totalBookNum];
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public boolean insertBook(Book b)
	{
        int check=0;
        for(int i=0;i<listOfBooks.length;i++)
        {
            if(listOfBooks[i]==null){
                listOfBooks[i]=b;
                check=1;
                break;
            }
        }
        if(check == 1)
		{
			System.out.println("Book Inserted!");
			return true;
		}
		else
		{
			System.out.println("Book Dosenot Inserted!");
			return false;
		}
		
    }

    public boolean removeBook(Book b)
	{
        int check=0;
        for(int i=0;i<listOfBooks.length;i++)
        {
            if(listOfBooks[i]==b){
                listOfBooks[i]=null;
                check=1;
                break;
            }
        }
        if(check == 1)
		{
			System.out.println("Book Removed!");
			return true;
		}
		else
		{
			System.out.println("Book Dosenot Found!");
			return false;
		}
    }

    public  Book searchBook(String isbn)
	{
		int index=0;
		int check = 0;
		for(int i = 0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i]==null){
			}
			else if(listOfBooks[i].getIsbn()== isbn)
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
		return listOfBooks[index];
	}
	
    public void showAllBooks()
	{
		for(int i = 0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i]!=null)
			{
				System.out.println("*** Book No:"+(i+1)+" ***");
				System.out.println(" ");
				listOfBooks[i].showDetails();
				System.out.println(" ");
			}
		}
	}
}
