package Reverse.Pattern;
import java.util.Scanner;		
public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=input.nextInt();
		
		for(int i=num;i>=0;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
		input.close();

	}

}
