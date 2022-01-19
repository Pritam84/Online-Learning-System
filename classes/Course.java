package classes;

import java.lang.*;
import java.util.Scanner;
import java.io.*;
//import java.io.FileNotFoundException;
import java.util.Formatter;

public class Course
{
    private FileReader reader;
	private BufferedReader bfr;
	String r = "Read";
	
    public void Plan()
	{	
	File dir = new File(r);
	dir.mkdir(); //creating directory
	String path = dir.getAbsolutePath();
	
	File file1 = new File(path+"/Bangla.txt");
	File file2 = new File(path+"/English.txt");
	File file3 = new File(path+"/Math.txt");
	File file4 = new File(path+"/Science.txt");
	File file5 = new File(path+"/Programming.txt");
	
	try
	{
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		file4.createNewFile();
		file5.createNewFile();
	}
	
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	if(file1.exists())
	{
		System.out.println("Bangla exists");
	}
	else
	{
		System.out.println("File does not exists");
	}
	if(file2.exists())
	{
		System.out.println("English exists");
	}
	else
	{
		System.out.println("File does not exists");
	}
	if(file3.exists())
	{
		System.out.println("Math exists");
	}
	else
	{
		System.out.println("File does not exists");
	}
	if(file4.exists())
	{
		System.out.println("Science exists");
	}
	else
	{
		System.out.println("File does not exists");
	}
	if(file5.exists())
	{
		System.out.println("Programming exists");
	}
	else
	{
		System.out.println("File does not exists");
	}
	
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Read/Bangla.txt");
	formatter.format("Bangla\r\n");
	formatter.format("You can read bangla here\r\n");
	
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Read/English.txt");
	formatter.format("English\r\n");
	formatter.format("You can read English here\r\n");
	
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Read/Math.txt");
	formatter.format("Math\r\n");
	formatter.format("You can learn Math here\r\n");
	
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Read/Science.txt");
	formatter.format("Science\r\n");
	formatter.format("You can read Science here\r\n");
	
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Read/Programming.txt");
	formatter.format("Programming\r\n");
	formatter.format("You can learn Programming here\r\n");
	
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	
	
	
	}
	public void readFromFile() 
	{
        Scanner s = new Scanner(System.in);
		
		
		try
		{
			System.out.println("1.Bangla \n 2.English \n 3. Math \n 4.Science \n 5. Programming");
			System.out.print("Your Option: ");
			int e = s.nextInt();
			String q = "";
			if(e==1)
			{
			q="F:/Varsity Summer 19-20/Java Project/classes/Read/Bangla.txt";
			}
			else if (e==2)
			{
				q ="F:/Varsity Summer 19-20/Java Project/classes/Read/English.txt";
			}
			else if(e==3)
			{
				q="F:/Varsity Summer 19-20/Java Project/classes/Read/Math.txt";
			}
			else if(e==4)
			{
				q="F:/Varsity Summer 19-20/Java Project/classes/Read/Science.txt";
			}
			else if(e==5)
			{
				q="F:/Varsity Summer 19-20/Java Project/classes/Read/Programming.txt";
			}
			FileReader in = new FileReader(q);
            BufferedReader br = new BufferedReader(in);

            while (br.readLine() != null) {
            System.out.println(br.readLine());
            }
            in.close();					//closing the file.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
	