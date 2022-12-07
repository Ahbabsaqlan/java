import java.lang.*;
public class Student {
    public String name;
    public String s_id;
    public Calculator c;
    public Student(String name, String id, Calculator c)
    {
        this.name=name;
        this.s_id=id;
        this.c=c;
    }
    public void performAddition(int a, int b)
    {
        c.addition(a, b);
    }
    public void performSubtraction(int a, int b)
    {
        c.subtraction(a, b);
    }
    public void displayDetails()
    {
        System.out.println("Student Name:"+name);
        System.out.println("Student ID:"+s_id);
        c.display();
    }
}
