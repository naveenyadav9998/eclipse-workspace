class Employee
{
	int eid;
	String name;
	long salary,totalsalary;
	Employee(int eid, String name, long salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void putEmployee()
	{
		System.out.println("eid:"+eid+" Name:"+name+" Salary:"+salary);
	}
}
class Perks extends Employee

{
	int da;
	int hra;
	int pf;
	Perks(int eid, String name, long salary,int da,	int hra,int pf)
	{ super(eid,name,salary);
		this.da=da;
		this.hra=hra;
		this.pf=pf;
		
	}
	void putPerks()
	{
		putEmployee();
	
		System.out.println("da:"+da+" hra:"+hra+" pf:"+pf);
		totalsalary=salary+da+hra+pf;
		System.out.println("TotalSalary: "+totalsalary);
	}
}

public class MainEx 
{
	public static void main(String args[])
	{
		Perks p=new Perks(101,"Karan",45000,2000,20000,5000);
		p.putPerks();
		
	}

}
