import java.util.*;
class Bank 
{
	private String name;
	private int accno,balance,amount;
	
	Scanner input=new Scanner(System.in);
	
	void getDetail()
	{
		System.out.print("Enter Your Holder name: ");
		name=input.nextLine();
		
		System.out.print("Enter your Account Number: ");
		accno=input.nextInt();
		
		System.out.print("Enter Your Account Balance: ");
		balance=input.nextInt();
		
	}
	void showBalance()
	{
		System.out.println("Enter Your Choice\n For Creadit Press:1\n For Debit press:2");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("Enter amount You want to creadit: ");
			amount=input.nextInt();
			balance=balance+amount;
			break;
			
		case 2:
			System.out.print("Enter amount You want to Debit ");
			amount=input.nextInt();
			if(amount>balance)
			{
				System.out.println("Account balance is not Sufficent");
			}
			else 
			{
			balance=balance-amount;
			}
			break;
		default:
			System.out.println("Please Choose Correct Option");
			break;
			}
	}
	void putDetail()
	{
		System.out.println("Your Name: "+name);
		
		System.out.println("Your Account number is: "+accno);
		
		System.out.println("Your acoount balance is: "+balance);
		
	}

}
class LogicBank
{
	public static void main(String args[])
	{
		Bank b1=new Bank();
		b1.getDetail();
		b1.showBalance();
		b1.putDetail();
	}
}
