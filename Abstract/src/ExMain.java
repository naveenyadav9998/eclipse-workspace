
 abstract class shape
{
	abstract void draw();
}
 
 class rectangle extends shape
 {

	
	void draw() 
	{
		System.out.println("This is rectangle");
		
	}
	 
 }
 class circle extends shape
 {

	
	void draw() 
	{
		System.out.println("This is circle");
		
	}
	 
 }
 
 class tringle extends shape
 {

	
	void draw() 
	{
		System.out.println("This is tringle");
		
	}
	 
 }


public class ExMain 
{
	public static void main(String args[])
	{
		shape d1;
		d1=new rectangle();
		d1.draw();
		 d1=new circle();
		 d1.draw();
		 d1=new tringle();
		 d1.draw();
		
		
		
		
	}

}
