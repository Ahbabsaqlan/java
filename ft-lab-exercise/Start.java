import java.lang.*;
public class Start {
    public static void main(String[] agrs)
    {
        Calculator c1=new Calculator("Casio-fx 990 ES", 500);
        Student s1=new Student("Ahbab Sakalan","22-48108-2", c1);
        s1.performAddition(500, 100);
        s1.performSubtraction(500,100);
        s1.displayDetails();
    }
}
