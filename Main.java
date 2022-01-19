import classes.*;
import interfaces.*;
import java.lang.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main 
{
	
	public static void main(String[] args)
	{   
		Scanner sc = new Scanner(System.in);
		Teacher v;
		Student l;
		Database db = new Database(50);
		
        try
		{
		System.out.println("-----Welcome to online learning system-----");
			while(true)
			{   
		        int x;
				//System.out.println("-----Welcome to online learning system-----");
				
				System.out.println("Already have an Account?\r\n 1.Login\r\n New Here?\r\n 2.Signup\r\n 3.Exit");
				//System.out.print("Choose Your Option: ");
			    x = sc.nextInt();
				
				
				String u1;
				
				if(x == 1)
				{  
					String Username[] = {"Farhan","Saima","Abc","XYZ","Java"};
		            String Password []= {"Teletalk","Grameen","Robi","Airtel","Banglalink"}; 
	
		            Scanner s = new Scanner(System.in);
		            System.out.print("Enter Your User Name: ");
		            u1 = s.nextLine();
		
		            Scanner s1 = new Scanner(System.in);
		            System.out.print("Enter Your Password: ");
		            String p = s1.nextLine();
					boolean b= true;
					for(int i=0;i<Username.length;i++){
						if(u1.equals(Username[i]) && p.equals(Password[i])){
							System.out.println("Access Granted!");
							System.out.println("-----Welcome-----");
							b=false;
							break;
							
						}
					}
		
		        if(b==true){
					System.out.println("Invalid user id or password!!");
					System.out.println("Please Try Again!!");
				}
				else
				{   
					System.out.println("1. Teacher \n 2. Student \n 3.Exit");
					System.out.print("Choose Your Option: ");
					int a;
					a = sc.nextInt();
					
					
					if(a==1)
					{
						System.out.println("What do you want to do?");
					    System.out.println("1. Insert User \n 2. Remove User \n 3.Show all users \n 4. Set result \n 5.Exit");
						System.out.print("Your Option: ");
					    int k;
						k=sc.nextInt();
						v= new Teacher();
						l= new Student();
						if(k==1)
						{
							
							System.out.println("1. Student \n 2. Teacher");
							System.out.print("Your identity: ");
							int k1=sc.nextInt();
							System.out.print("Enter your Id: ");
							int s9 = sc.nextInt();
							System.out.print("Enter your Email: ");
			                String s11 = sc.next();
							System.out.print("Enter your Contact Number: ");
			                int s13 = sc.nextInt();
					
							
							if(k1==2){
								System.out.print("Enter your Subject: ");
			                    String s5 = sc.next();
								
								v.setId(s9);
								v.setName(u1);
							    v.setEmail(s11);
								v.setSubject(s5);
								v.setNumber(s13);
								
					
							    db.insertUser(v);
							}
							else{
								l.setId(s9);
								l.setName(u1);
							    l.setEmail(s11);
					            l.setNumber(s13);
							    db.insertUser(l);
							}
							
						}
						else if(k==2){
							db.removeUser(v);
						}
						else if(k==3){
							db.showAllUser();
						}
						else if(k==4){
						System.out.print("Set Result: ");
						Result w = new Result();
						String c = "";
						c=sc.next();
						w.Publish(c);
						}
						else if(k==5)
		                {
			             break;
		                }
					}
					else if(a==2)
					{
					System.out.println(" ");
					System.out.println("1. Read \n 2. Give Exam \n 3. Get Result \n 4.Exit");
					System.out.print("What do you want?");
					int u;
					u = sc.nextInt();
					if(u==1)
					{
				    Course c = new Course();
		            c.Plan();
					c.readFromFile();
					}
					else if(u==2)
					{
						GiveExam ge = new GiveExam();
						ge.Exam();
						ge.readFromFile();
					}
					else if(u==3)
					{
						System.out.print("Your result is: ");
						Result i = new Result();
						System.out.println(i.Seen());
					}
					else if(u == 4)
		            {
			        break;
		            }
					}
					else if (a==3)
					{
						break;
					}
				}
				}
                else if(x == 2)
		        {
		            //Signup su = new Signup();
					
		            System.out.println("Enter Your Name: ");
		            String s = sc.next();
		
		            System.out.println("Enter your  Email: ");
		            String s1 = sc.next();
	
		            System.out.println("Enter your Password: ");
		            String s6 = sc.next();
	
		         
					//Date dt = new Date();
					System.out.print("Enter Your Date of Birth:-");
					System.out.print("Day: ");
					int d1 = sc.nextInt();
					System.out.print("Month: ");
					int d2 = sc.nextInt();
					System.out.print("Year: ");
					int d3 = sc.nextInt();
					Date dt = new Date(d1,d2,d3);
		            //String s8 = sc.next();
					
					System.out.println("Enter your Contact Number: ");
		            int s10 = sc.nextInt();
					
					
		            /*su.setName(s);
					su.setEmail(s1);
					su.setPassword(s6);
					dt.setDate(d1,d2,d3);
					su.setNumber(s10);*/
					Signup su = new Signup(s,s1,s6,dt,s10);
					System.out.println("----Your Details-----");
					su.ShowInfo();
		            /*System.out.println("Name: " +s);
		            System.out.println("Email: " +s1);
		            System.out.println("Password: " +s6);
		            System.out.println("Date of Birth: " +s8);
					System.out.println("Contact Number: " +s10);*/
		            System.out.println(" ");
					System.out.println("1. Teacher \n 2. Student \n 3.Exit");
					System.out.print("Your identity: ");
					int a;
					a = sc.nextInt();
					
					
					if(a==1)
					{
						System.out.println(" ");
					    System.out.println("1. Insert User \n 2. Remove User \n 3.Show all users \n 4. Set result \n 5.Exit");
						System.out.print("What do you want: ");
					    int k;
						k=sc.nextInt();
						v= new Teacher();
						l= new Student();
						if(k==1)
						{
							
							System.out.println("1. student \n 2. teacher \n 3.Exit");
							int k1=sc.nextInt();
							System.out.println("Enter your Id: ");
							int s9 = sc.nextInt();
							
							
							if(k1==2){
								System.out.println("Enter your Subject: ");
			                    String s5 = sc.next();
								v.setId(s9);
								v.setName(s);
							    v.setEmail(s1);
								v.setSubject(s5);
					            v.setNumber(s10);
							    db.insertUser(v);
							}
							else if (k1==1){
								l.setId(s9);
								l.setName(s);
							    l.setEmail(s1);
					            l.setNumber(s10);
							    db.insertUser(l);
							}
							else if(k1==3)
							{
								break;
							}
							
						}
						else if(k==2){
							db.removeUser(l);
						}
						else if(k==3){
							db.showAllUser();
						}
						else if(k==4){
						Result w = new Result();
						
						String c = "";
						c=sc.next();
						w.Publish(c);
						}
						else if(k==5)
						{
							break;
						}
					}
					else if(a==2)
					{
						System.out.println(" ");
					System.out.println("1. Read  \n 2. Give Exam \n 3. Get Result \n 4.Exit");
					int u;
					u = sc.nextInt();
					if(u==1)
					{
				    Course c = new Course();
		            c.Plan();
					c.readFromFile();
					}
					else if(u==2)
					{
						GiveExam ge = new GiveExam();
						ge.Exam();
						ge.readFromFile();
					}
					else if(u==3)
					{
						Result i = new Result();
						System.out.println(i.Seen());
					}
					else if(u==4)
					{
						break;
					}
					}
					else if(a==3)
					{
						break;
					}
		 
		
		        }
		        else if(x == 3)
		        {
			        break;
		        }
				}
			}	
			    catch(InputMismatchException ime)
				{
					System.out.println("Input Mismatch exception occured");
				}
				catch(NullPointerException npe)
				{
					System.out.println("Null pointer Exception occured");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				finally
				{
					System.out.println("-------End--------");
				}
			}   
				
	}
	
