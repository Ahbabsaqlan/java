
public class Start {
    public static void main(String[] args)
    {
        StoryBook S1=new StoryBook();
        S1.setIsbn("48-108");
        S1.setBookTitle("Ones Upon A Time In Mumbai");
        S1.setAuthorName("Jhon Abraham");
        S1.setPrice(500.85);
        S1.setAvailableQuantity(500);
        S1.addQuantity(100);
        S1.sellQuantity(50);
        S1.setCategory("Story Type");
        S1.showDetails();

        StoryBook S2= new StoryBook("22-48108", "Ones Upon A Time In Mumbai Dubara", "Akshay Kumar", 660.50, 400, "Scquential");
        S2.showDetails();

        TextBook T1=new TextBook();
        T1.setIsbn("485254-222");
        T1.setBookTitle("Discete math");
        T1.setAuthorName("Dr Steve Smith");
        T1.setPrice(440.50);
        T1.setAvailableQuantity(900);
        T1.addQuantity(50);
        T1.sellQuantity(80);
        T1.setStandard(10);
        T1.showDetails();
    
        TextBook T2=new TextBook("400-8", "Calculus", "Newton", 199.99, 96, 8);
        T2.showDetails();



   }
}
