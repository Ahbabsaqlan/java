import java.lang.*;
public class Start {
    public static void main(String[] agrs)
    {
        BookShop s1=new BookShop("AIUB BookShop",200);

        Book b1=new TextBook("t-1","English","English For Today",120.40,7,8);
        Book b2=new TextBook("t-2","Bangla","Bangla Sahitto",200.50,5,10);
        Book b3=new TextBook("t-3","Mathematics","Shadharon Gonit",350.20,6,7);
        Book b4=new TextBook("t-4","Physics","Podartho Biggan",560.70,3,5);
        Book b5=new TextBook();

        b5.setIsbn("t-5");
        b5.setBookTitle("Chemistry");
        b5.setBookName("Roshayon");
        b5.setPrice(430.75);
        b5.setAvailableQuantity(10);
        b5.setStandard(9);

        System.out.println("ISBN: "+b5.getIsbn());
        System.out.println("BookTitle: "+b5.getBookTitle());
        System.out.println("BookName: "+b5.getBookName());
        System.out.println("Price: "+b5.getPrice());
        System.out.println("AvailableQuantity: "+b5.getAvailableQuantity());
        System.out.println("Standard: "+b5.getStandard());

        System.out.println(" ");
        System.out.println("**************************");
        System.out.println(" ");

        b3.showDetails();

        System.out.println(" ");
        System.out.println("**************************");
        System.out.println(" ");

        s1.insertBook(b1);
        s1.insertBook(b2);
        s1.insertBook(b3);
        s1.insertBook(b4);
        s1.insertBook(b5);
        s1.removeBook(b3);
        s1.searchBook("t-8");
        s1.insertBook(b3);
        s1.searchBook("t-1").addQuantity(10);
        s1.searchBook("t-5").sellQuantity(2);

        System.out.println(" ");
        System.out.println("**************************");
        System.out.println(" ");

        s1.showAllBooks();

        Book b6=new StoryBook("s-1","English Nobel","Romio-Juliet",120.40,7,"Tragidic");
        Book b7=new StoryBook("s-2","English Drama","Hemlate",200.50,5,"Dramatic");
        Book b8=new StoryBook("s-3","English Poet","Rose In The Garden",350.20,6,"Poetry");
        Book b9=new StoryBook("s-4","English History","British Colonization",560.70,3,"Historic");
        Book b10=new StoryBook();

        b10.setIsbn("s-5");
        b10.setBookTitle("English Romantic");
        b10.setBookName("Macbeth");
        b10.setPrice(430.75);
        b10.setAvailableQuantity(10);
        b10.setCategory("Romantic");

        System.out.println(" ");
        System.out.println("**************************");
        System.out.println(" ");

        System.out.println("ISBN: "+b10.getIsbn());
        System.out.println("BookTitle: "+b10.getBookTitle());
        System.out.println("BookName: "+b10.getBookName());
        System.out.println("Price: "+b10.getPrice());
        System.out.println("AvailableQuantity: "+b10.getAvailableQuantity());
        System.out.println("Category: "+b10.getCategory());

        System.out.println(" ");
        System.out.println("**************************");
        System.out.println(" ");

        b8.showDetails();

        System.out.println(" ");
        System.out.println("**************************");
        System.out.println(" ");

        s1.insertBook(b6);
        s1.insertBook(b7);
        s1.insertBook(b8);
        s1.insertBook(b9);
        s1.insertBook(b10);
        s1.removeBook(b8);
        s1.searchBook("s-4");
        s1.insertBook(b8);
        s1.searchBook("s-4").addQuantity(10);
        s1.searchBook("s-5").sellQuantity(2);

        System.out.println(" ");
        System.out.println("**************************");
        System.out.println(" ");

        s1.showAllBooks();
    }
}
