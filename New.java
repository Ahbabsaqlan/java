import java.lang.*;
public class New {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter userage");
    int userage=myObj.nextInt();
    myObj.nextLine();
    System.out.println("Enter username");
    String userName = myObj.nextLine(); 
    System.out.println("Username is: " + userName); 
  }
}