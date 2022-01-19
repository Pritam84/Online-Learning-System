package classes;


//import java.lang.*;
import interfaces.*;

public class Database implements IDatabaseOperations
{
	private static int numberOfUsers=0;
    User users[];
	
	public Database()
	{
		//numberOfUsers++;
		System.out.println("Users");
	}
	public Database(int size)
	{
		this.users = new User[size];
	}
	
	public void insertUser(User u)
	{
		int flag = 0;
		for(int i=0; i<users.length; i++)
		{
			if(users[i] == null)
			{
				users[i] = u;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("User Added");
			numberOfUsers++;
		}
		else 
		{
			System.out.println("Can not Add User");
		}
	}
	public void removeUser(User u)
	{
		int flag =0;
		for(int i=0; i<users.length; i++)
		{
			if(users[i] == u)
			{
				users[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("User has been removed");
			numberOfUsers--;
		}
		else
		{
			System.out.println(" Can Not remove");
		}
	}
	
	public void showAllUser()
	{

		for(int i=0; i<users.length; i++)
		{
			if(users[i] != null)
			{
				
				users[i].display();
				System.out.println();
			}
			
		}
		        System.out.println("Total Users: " +numberOfUsers);
	}
	

		
	}
	