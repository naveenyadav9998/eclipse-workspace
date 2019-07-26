import java.util.*;
 class Student
{
	private int rollno,p,c,m;
	private String name;
	private float per;
	Scanner input=new Scanner(System.in);
	
	void getDetail()
	{
		System.out.print("Enter Your Student Name: ");
		name=input.nextLine();
		
		System.out.print("Enter roll no.: ");
		rollno=input.nextInt();
		
		System.out.print("Enter Physics marks: ");
		p=input.nextInt();
		
		System.out.print("Enter Chemistry marks: ");
		c=input.nextInt();
		
		System.out.print("Enter Mathematics Marks: ");
		m=input.nextInt();
		
	}
	void showPercent()
	{
		per=(float)(p+c+m)/3;
	}
	void putDetail()
	{
		System.out.println("\nYour roll no. is: "+rollno);
		
		System.out.println("Your name is: "+name);
		
		System.out.println("Your Physics marks is: "+p);
		
		System.out.println("Your Chemistry marks is: "+c);
		
		System.out.println("Your mathematics marks is: "+m);
		
		System.out.println("Your percentage is: "+per);
		
	}

}
class logicStudent
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.getDetail();
		s1.showPercent();
		s1.putDetail();
	}
}
