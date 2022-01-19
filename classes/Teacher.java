package classes;

//import java.lang.*;
//import java.util.Scanner;

public class Teacher extends User
{

	private int id;
	private String subject;
	
	public Teacher()
	{
		System.out.println("--------------------");
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
    public void setSubject(String subject)
    {
		this.subject = subject;
	}	
	
	public int getId()
	{
		return id;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	public void display()
	{
		//super.display();
		System.out.println("Teacher ID: " +id);
		System.out.println("Subject: " +subject);
		System.out.println("User Name: " +name);
		System.out.println("User Email: " +email);
		System.out.println("User Contact Number: " +number);
	}
}