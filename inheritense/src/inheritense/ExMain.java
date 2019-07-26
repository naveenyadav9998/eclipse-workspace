package inheritense;
class Base
{
	Base()
	{
		System.out.println("This is Base Class:");
	}
	Base(int x)
	{
		System.out.println("This is Base Class x:"+x);
	}
}
class Derived extends Base
{
	Derived()
	{
		
		System.out.println("This is Derived class:");

	}
	Derived(int y)
	{
		super(y);
		System.out.println("This is Derived class Y:"+y);
	}
}
class ExMain 
{
	public static void main(String args[])
	{
		Derived d1=new Derived();
		Derived d2=new Derived(30);
		// Derive class constructor only call base class default constructor
		// not call parameterized constructor
		// only use
		
	}

}
