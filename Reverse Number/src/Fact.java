import java.util.*;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
