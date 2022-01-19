package classes;

//import java.lang.*;
//import java.util.Scanner;

public class Student extends User
{

	private int id;
	
	public Student()
	{
		System.out.println("--------------------");
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	
	public int getId()
	{
		return id;
	}
	
	public void display()
	{
		//super.display();
		
		System.out.println("Student ID: " +id);
		System.out.println("User Name: " +name);
		System.out.println("User Email: " +email);
		System.out.println("User Contact Number: " +number);
		//System.out.println("Result: " +result);
	}
	
}