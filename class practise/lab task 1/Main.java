import java.lang.*;
public class Main{
    public static void main(String[] args){
        Student s1=new Student();
        s1.setId(48108);
        s1.setName("AHBAB SAKALAN");
        s1.setCgpa(4.0);
        int studentId=s1.getId();
        System.out.println(studentId);
        String studentName=s1.getName();
        System.out.println(studentName);
        double studentCgpa=s1.getCgpa();
        System.out.println(studentCgpa);
    }
}
class Student{
	private int id;
	private String name;
	private double cgpa;
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setCgpa(double cgpa){
		this.cgpa=cgpa;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getCgpa(){
		return cgpa;
	}
}
	