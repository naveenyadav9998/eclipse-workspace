import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		String s1,rev="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String you want to Reverse: ");
		s1=input.nextLine();
		
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			rev=rev+c;
			
		}
		System.out.print(rev);
	}
}