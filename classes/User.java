package classes;

//import java.lang.*;

public abstract class User 
{
	
	protected /*private*/ String name;
	protected /*private*/ String email;
	protected /*private*/ int number;
	
	public User()
	{
		//System.out.println("Welcome");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public abstract void display();
	/*{
		System.out.println("User Name: " +name);
		System.out.println("User Email: " +email);
		System.out.println("User Contact Number: " +number);
	}*/
	
}