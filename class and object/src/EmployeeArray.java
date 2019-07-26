import java.util.*;
class EmployeeArray
{
	private String name;
	private int id,sallery,hra,da;
	private float bonus,totalsallery;
	
	Scanner input=new Scanner(System.in);
	
	void getDetails()
	{
		System.out.print("Enter Emp name: ");
		name=input.nextLine();
		
		System.out.print("Enter your id: ");
		id=input.nextInt();
		
		System.out.print("Enter your sallery: ");
		sallery=input.nextInt();
		
		System.out.print("Enter your hra: ");
		hra=input.nextInt();
		
		System.out.print("Enter your da: ");
		da=input.nextInt();
		
	}
	
	void showSallery()
	{
		totalsallery=sallery+hra+da;

		if(totalsallery>=20000)
		{
			bonus=(totalsallery*10)/100;
			totalsallery=bonus+totalsallery;
		}
		else if(totalsallery>=50000)
		{
			bonus=(totalsallery*20)/100;
			totalsallery=bonus+totalsallery;
		}
		else if(totalsallery>=80000)
		{
			bonus=(totalsallery*30)/100;
			totalsallery=(totalsallery+bonus)*-5/100;
			
		}
		
	}
	void putDetail()
	{
		System.out.println("Your name is: "+name);
		
		System.out.println("Your id is: "+id);
		
		System.out.println("Your sallery is: "+sallery);
		
		System.out.println("Your hra is: "+hra);
		
		System.out.println("Your da is: "+da);
		
		System.out.println("Your bonus: "+bonus);
		
		System.out.println("Your totalsallery is:\n "+totalsallery);
		
		
	}

}
class EmployeeMain
{
	public static void main(String args[])
	{
    
	Scanner input=new Scanner(System.in);
	System.out.println("Enter no. of Employee: ");
	int n=input.nextInt();
	Employee e[]=new Employee[n];
	
	for(int i=0;i<e.length;i++)
	{
		e[i]=new Employee();
		e[i].getDetails();
	}
	for(int i=0;i<e.length;i++)
	{
		e[i].showSallery();
		e[i].putDetail();
	}
}
}