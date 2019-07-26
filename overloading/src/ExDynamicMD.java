class Base
{
	void show() 
	{
		System.out.println("Base Class");
		
	}
}
class Derived extends Base
{
	void show()
	{
		System.out.println("This is Derived class ");
		
	}
}

public class ExDynamicMD {

	public static void main(String[] args) 
	{
		Base B;
		Derived d1=new Derived();
		B=d1;
		B.show();
		
		Base b1=new Base();
		B=b1;
		B.show();

	}

}
