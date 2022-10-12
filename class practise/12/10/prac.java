
import java.util.*;
public class prac {
  public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter userage");
    int userAge = myObj.nextInt();
    myObj.nextLine();
    System.out.println("Enter username");
    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    System.out.println("Userage is: " + userAge);

  }
}
