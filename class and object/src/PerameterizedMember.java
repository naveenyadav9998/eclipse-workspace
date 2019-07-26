
public class PerameterizedMember
{
	private int x,y;
	
	void getDetail(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void putDetail()
	{
		System.out.println("Your Value of x:"+x);
		
		System.out.println("Your value of y:"+y);
		
	}

}

class MainPerameterizedMember
{
	public static void main(String args[])
	{
		PerameterizedMember obj=new PerameterizedMember();
		obj.getDetail(2, 3);
		obj.putDetail();
	}
}
