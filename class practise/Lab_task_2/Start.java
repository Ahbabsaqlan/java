import java.lang.*;

public class Start 
{
    public static void main(String[] args)
    {
        Book a1=new Book();
        a1.setIsbn("Romantic");
        a1.setBookTitle("A RED ROSE");
        a1.setAuthorName("AHBAB SAKALAN");
        a1.setPrice(593.00);
        a1.setAvailableQuantity(15);
        a1.addQuantity(5);
        String s1= a1.getIsbn();
        String s2= a1.getBookTitle();
        String s3= a1.getAuthorName();
        double d1= a1.getPrice();
        int i1= a1.getAvailableQuantity();
        System.out.println("Isbn: "+s1+", BookTitle: "+s2+", AuthorName: "+s3+", Price: "+d1+", AvailableQuantity: "+i1);
        a1.sellQuantity(10);
        a1.showDetails();

        Book a2=new Book("Fiction","Get On The Moon","AHBAB SAKALAN",720.0,13);
        a2.addQuantity(7);
        String S1= a2.getIsbn();
        String S2= a2.getBookTitle();
        String S3= a2.getAuthorName();
        double D1= a2.getPrice();
        int I1= a2.getAvailableQuantity();
        System.out.println("Isbn: "+S1+", BookTitle: "+S2+", AuthorName: "+S3+", Price: "+D1+", AvailableQuantity: "+I1);
        a2.sellQuantity(12);
        a2.showDetails();
    }
}
