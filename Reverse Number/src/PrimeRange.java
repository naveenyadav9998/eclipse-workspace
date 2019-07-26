import java.util.*;
public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int num1=input.nextInt();
		
		System.out.println("Enter ENding number: ");
		int num2=input.nextInt();
		
		int arr1[];
		
		for(int i=num1;i<=num2;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				
			}
			
			if(count==1 || num1==1 || num1==0 || num1<0 )
			{
				
				System.out.println("number is not prime "+i);
				
			}
			else
			{
				System.out.println("number is prime "+i);
			}
			
		}
		

	}

}
