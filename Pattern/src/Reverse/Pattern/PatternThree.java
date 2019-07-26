package Reverse.Pattern;
import java.util.Scanner;		
public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=input.nextInt();
		
		int val=1;
		
		for(int i=num;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+val);
				val++;
				val++;
			}
			System.out.println(" ");
		}
		input.close();

	}

}
