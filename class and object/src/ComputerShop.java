import java.util.*;
class ComputerShop 
{
	private String pname;
	private int price,qty,finalprice,discount,sellqty,rqty;
	Scanner input=new Scanner(System.in);
	
	void getDetail()
	{
		System.out.print("Enter Computer Component name: ");
		pname=input.nextLine();
		
		System.out.print("Enter Quantity of Component: ");
		qty=input.nextInt();
		
		System.out.print("Enter Price of Component: \n");
		price=input.nextInt();
	}
	
	void mainFunction()
	{
		System.out.println("Enter Your Choice\n For Sell Press:1\n For Exit press:2");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Quantity of product want to purchased: ");
			sellqty=input.nextInt();
			rqty=qty-sellqty;
			if(sellqty>=4)
			{
				discount=(sellqty*price*10)/100;
				finalprice=(sellqty*price)-discount;
			}
			else
			{
				finalprice=sellqty*price;
			}
			break;
		case 2:
		break;
		
		default:
			System.out.println("Please Choose Correct Option");
			break;
		}	
	}
	
	void putDetail()
	{
		System.out.println("Computer Component Name: "+pname);
		
		System.out.println("Quntity of Component: "+qty);
		
		System.out.println("Remain Quntity of Component: "+rqty);
		
		System.out.println("Price of Component: "+price);
		
		System.out.println("Discount of Component: "+discount);
		
		System.out.println("Final price is:"+finalprice+"\n");
		
	}

}

class MainComputerShop
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of Component: ");
		int n=input.nextInt();
		
		ComputerShop c[]=new ComputerShop[n];
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=new ComputerShop();
			c[i].getDetail();
		}
		
		for(int i=0;i<c.length;i++)
		{
		    c[i].mainFunction();
		    c[i].putDetail();
		}
	}
}
