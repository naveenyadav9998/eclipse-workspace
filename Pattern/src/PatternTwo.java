import java.util.Scanner;		
public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=input.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
		input.close();

	}

}
