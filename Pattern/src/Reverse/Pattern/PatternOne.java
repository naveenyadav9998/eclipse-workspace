package Reverse.Pattern;

import java.util.Scanner;		
public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=input.nextInt();
		
		for(int i=num;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		input.close();

	}

}
