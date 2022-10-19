import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setId("19-91451-3");
		s1.setCgpa(4.00);
		s1.display();
		
		int arr1[]=new int[3];
		//System.out.println("ID: "+s1.getId());
		//System.out.println("ID: "+s1.getCgpa());
		
		Student s2 = new Student("22-32566-2", 3.98);
		s2.display();
		
		if(s1.getCgpa()<s2.getCgpa())
		{
			System.out.println("S2 is greater"+s2.getId());
		}
		else
		{
			System.out.println("S1 is greater"+s1.getId());
		}
	}
}