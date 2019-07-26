import java.util.*;

class PrintPrimeSeries
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Range of Prime Number: ");
		int max=input.nextInt();

		int fact;
		 for(int i=1; i<=max; i++)
		    {
		        fact=0;
		        for(int j=1; j<=max; j++)
		        {
		            if(i%j==0)
		                fact++;
		        }
		        if(fact==2)
           		{
					System.out.println("prime number are " +i);
				}
			}
		}
	}
