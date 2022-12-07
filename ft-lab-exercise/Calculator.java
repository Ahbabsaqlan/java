import java.lang.*;
public class Calculator implements ICalculatorOperations
{
    public String model;
    public double price;
    public Calculator(String model, double price)
    {
        this.model=model;
        this.price=price;
    }
    public void addition(int a,int b)
    {
        System.out.println("Addition Result:"+(a+b));
    }
    public void subtraction(int a,int b)
    {
        System.out.println("Subtraction Result:"+(a-b));
    }
    public void display()
    {
        System.out.println("Calculator Model:"+model);
        System.out.println("Calculator Price:"+price);
    }
}
