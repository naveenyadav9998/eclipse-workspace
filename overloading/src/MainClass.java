import java.util.*;

class Student
{
	private int rollno;
	private String name;
	 int marks1,marks2,marks3,per;
	
	Scanner input=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter name: ");
		name=input.nextLine();
		System.out.println("enter Roll no.: ");
		rollno=input.nextInt();
		
	}
	
	void function()
	{
		per=(marks1+marks2+marks3)/3;
	}
	
	void put()
	{
		System.out.println("Student name is: "+name);
		System.out.println("Student Roll No. is: "+rollno);
		
	}
	
}
class Bsc extends Student
{
	private String sub1,sub2,sub3;
	
	Scanner input=new Scanner(System.in);
	
	void get() 
	{
		System.out.println("This is Bsc class");
		System.out.println("Enter First Subject Name");
		sub1=input.nextLine();
		
		System.out.println("Enter Secound Subject Name");
		sub2=input.nextLine();
		
		System.out.println("Enter third Subject Name");
		sub3=input.nextLine();
		
		System.out.println("Enter First Subject Marks");
		marks1=input.nextInt();
		
		System.out.println("Enter Secound Subject Marks");
		marks2=input.nextInt();
		
		System.out.println("Enter third Subject Marks");
		marks3=input.nextInt();
		
	}
	void put()
	{
		System.out.println("First Subject Name "+sub1+" and Subject marks is: "+marks1);
		
		System.out.println("First Subject Name "+sub2+" and Subject marks is: "+marks2);
		
		System.out.println("First Subject Name "+sub3+" and Subject marks is: "+marks3);
		
		System.out.println("Percentage is: "+per);
	}
}

class Mca extends Student
{
	private String sub1,sub2,sub3;
	
	Scanner input=new Scanner(System.in);
	
	void get() 
	{
		System.out.println("This is Mca class");
		System.out.println("Enter First Subject Name");
		sub1=input.nextLine();
		
		System.out.println("Enter Secound Subject Name");
		sub2=input.nextLine();
		
		System.out.println("Enter third Subject Name");
		sub3=input.nextLine();
		
		System.out.println("Enter First Subject Marks");
		marks1=input.nextInt();
		
		System.out.println("Enter Secound Subject Marks");
		marks2=input.nextInt();
		
		System.out.println("Enter third Subject Marks");
		marks3=input.nextInt();
	}
	void put()
	{
		System.out.println("First Subject Name "+sub1+" and Subject marks is: "+marks1);
		
		System.out.println("First Subject Name "+sub2+" and Subject marks is: "+marks2);
		
		System.out.println("First Subject Name "+sub3+" and Subject marks is: "+marks3);
		
		System.out.println("Percentage is: "+per);
	}
}

class Be extends Student
{
	private String sub1,sub2,sub3;
	
	Scanner input=new Scanner(System.in);
	
	void get() 
	{
		System.out.println("This is Be class ");
		System.out.println("Enter First Subject Name");
		sub1=input.nextLine();
		
		System.out.println("Enter Secound Subject Name");
		sub2=input.nextLine();
		
		System.out.println("Enter third Subject Name");
		sub3=input.nextLine();
		
		System.out.println("Enter First Subject Marks");
		marks1=input.nextInt();
		
		System.out.println("Enter Secound Subject Marks");
		marks2=input.nextInt();
		
		System.out.println("Enter third Subject Marks");
		marks3=input.nextInt();
		
	}
	void put()
	{
		System.out.println("First Subject Name "+sub1+" and Subject marks is: "+marks1);
		
		System.out.println("First Subject Name "+sub2+" and Subject marks is: "+marks2);
		
		System.out.println("First Subject Name "+sub3+" and Subject marks is: "+marks3);
		
		System.out.println("Percentage is: "+per);
	}
}



public class MainClass
{
	public static void main(String args[])
	{
		Student s1;
		Student S2=new Student();
		s1=S2;
		s1.get();
		s1.put();
		
		Bsc B1=new Bsc();
		s1= B1;
		s1.get();
		s1.function();
		s1.put();
		
		Mca m1=new Mca();
		s1=m1;
		s1.get();
		s1.function();
		s1.put();
		
		Be Be1=new Be();
		s1=Be1;
		s1.get();
		s1.function();
		s1.put();
		
	}

}
