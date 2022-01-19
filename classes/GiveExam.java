package classes;

import java.lang.*;
import java.util.Scanner;
import java.io.*;
//import java.io.FileNotFoundException;
import java.util.Formatter;

public class GiveExam
{
    private FileReader reader;
	private BufferedReader bfr;
	String t = "Exam";
    public void Exam()
	{	
	File dir = new File(t);
	dir.mkdir(); //creating directory
	String path = dir.getAbsolutePath();
	
	File file1 = new File(path+"/Bangla Exam.txt");
	File file2 = new File(path+"/English Exam.txt");
	File file3 = new File(path+"/Math Exam.txt");
	File file4 = new File(path+"/Science Exam.txt");
	File file5 = new File(path+"/Programming Exam.txt");
	
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
		System.out.println("Bangla Exam exists");
	}
	else
	{
		System.out.println("File does not exists");
	}
	if(file2.exists())
	{
		System.out.println("English Exam exists");
	}
	else
	{
		System.out.println("File does not exists");
	}
	if(file3.exists())
	{
		System.out.println("Math Exam exists");
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
		System.out.println("Programming Exam exists");
	}
	else
	{
		System.out.println("File does not exists");
	}
	
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Exam/Bangla Exam.txt");
	formatter.format("Bangla exam\r\n");
	formatter.format("You can give Bangla exam here\r\n");
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Exam/English Exam.txt");
	formatter.format("English Exam\r\n");
	formatter.format("You can give English Exam here\r\n");
	
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Exam/Math Exam.txt");
	formatter.format("Math Exam\r\n");
	formatter.format("You can give Math exam here\r\n");
	
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Exam/Science Exam.txt");
	formatter.format("Science Exam\r\n");
	formatter.format("You can give Science exam here\r\n");
	
	formatter.close();
	
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
	try{
	Formatter formatter = new Formatter("F:/Varsity Summer 19-20/Java Project/classes/Exam/Programming Exam.txt");
	formatter.format("Programming Exam\r\n");
	formatter.format("You can give Programming Exam here\r\n");
	
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
			int f = s.nextInt();
			String r = "";
			if(f==1)
			{
			r="F:/Varsity Summer 19-20/Java Project/classes/Exam/Bangla Exam.txt";
			}
			else if (f==2)
			{
			r="F:/Varsity Summer 19-20/Java Project/classes/Exam/English Exam.txt";
			}
			else if(f==3)
			{
			r="F:/Varsity Summer 19-20/Java Project/classes/Exam/Math Exam.txt";
			}
			else if(f==4)
			{
			r="F:/Varsity Summer 19-20/Java Project/classes/Exam/Science Exam.txt";
			}
			else if(f==5)
			{
			r="F:/Varsity Summer 19-20/Java Project/classes/Exam/Programming Exam.txt";
			}
			FileReader in = new FileReader(r);
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
	