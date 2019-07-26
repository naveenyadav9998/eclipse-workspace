import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,rem,rev=0;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		num=input.nextInt();
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(temp==rev)
		System.out.println("No. is palindrome");
		else
			System.out.println("No. is not palindrome");

	}

} 