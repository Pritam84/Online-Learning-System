package classes;

//import java.lang.*;

public class Date{
	
	private int day;
	private int month;
	private int year;
    	
	public Date()
	{
		System.out.println("Enter your Date of Birth: ");
	}
	
	public Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDate(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String getDate()
	{
		return day+"/"+month+"/"+year;
	}
	
}