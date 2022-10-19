import java.lang.*;
public class Student
{
	private String id;
	private double cgpa;
	
	public Student()
	{
		System.out.println("Empty cons");
	}
	
	public Student(String id, double cgpa)
	{
		System.out.println("Parameterized cons");
		this.id = id;
		this.cgpa = cgpa;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public String getId()
	{
		return id;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void display()
	{
		System.out.println("Id: "+id);
		System.out.println("CGPA: "+cgpa);
	}
	
}