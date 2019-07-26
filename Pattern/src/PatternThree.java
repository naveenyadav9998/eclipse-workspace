import java.util.*;
public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int x=input.nextInt();
		
		int val=1;
		
		for(int i=0;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+val);
				val++;
				
			}
			System.out.println(" ");
		}
		input.close();

	}

}
