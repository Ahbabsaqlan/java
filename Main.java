import java.util.*;
public class Main {
  public static void main(String[] args) {
    System.out.println(3+3);
    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);
    System.out.println(Math.max(5, 10));
    System.out.println(Math.abs(-4.7));
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }
    String[] Cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < Cars.length; i++) {
      System.out.println(Cars[i]);
    }
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input

  }
}