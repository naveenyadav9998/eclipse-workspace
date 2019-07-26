class Emp
{
	static int eid;
	static int salary;
	static String ceo="Akash";
	 
	

	 static void show()
	{
		System.out.println(eid+","+salary+","+ceo);
		
	}
	
	static {
		System.out.print(ceo+": ");
		System.out.println("In static block");
		
	}
	
}
public class demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Emp();
		Emp.eid=101;
		Emp.salary=30000;
		Emp.ceo="Vivek";
		
		new Emp();
		Emp.eid=201;
		Emp.salary=45000;
		Emp.ceo="parul";
		 Emp.show();
		
	}

}
