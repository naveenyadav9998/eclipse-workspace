package Reverse.Pattern;
import java.util.Scanner;
public class CisPattren 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=input.nextInt();
		int k=1;	
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k+2;
				if(k>11)
				{
					k=1;
				}
			}
			System.out.println(" ");
		}
		input.close();

	}

}