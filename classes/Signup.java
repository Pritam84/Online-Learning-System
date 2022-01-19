package classes;

//import java.lang.*;
//import java.util.Scanner;

public class Signup
{
	private String Name;
	private String Email;
	private String Password;
	private Date date;
	private int number;
	public Signup()
	{
		System.out.println("Welcome to Signup page!");
		//this.date = new Date();
	}
	public Signup(String Name, String Email, String Password, Date date, int number)
	{
		this.Name = Name;
		this.Email = Email;
		this.Password = Password;
		this.date = date;
		this.number = number;
	}
	
	public void setName(String Name) 
    {
        this.Name = Name;
	}
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	public void setPassword(String Password)
	{
		this.Password = Password;
	}
    public void setDate(Date date)
	{
		this.date = date;
	}	
	
	public void setNumber(int number) 
    {
        this.number = number;
	}
	
	public String getName()
	{
		return Name;
	}
	public String getEmail()
	{
		return Email;
	}
	public String getPassword()
	{
		return Password;
	}
	public Date getDate()
	{
		return date;
	}
	public int getNumber()
	{
		return number;
	}
	public void ShowInfo()
	{
		System.out.println("Name: " +getName());
		System.out.println("Email: " +getEmail());
		System.out.println("Password: " +getPassword());
		System.out.println("Date of Birth: " +date.getDate());
		System.out.println("Contact Number: " +getNumber());
	}
	
}