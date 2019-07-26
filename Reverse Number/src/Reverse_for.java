import java.util.*;
public class Reverse_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev = 0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number you want to reverse: ");
		num=input.nextInt();
		for(;num>0;)
		{
			int rem=num%10;
			 rev=rev*10+rem;
			num=num/10;
		}
			System.out.println(rev);
		

	}

}
