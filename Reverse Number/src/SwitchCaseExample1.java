import java.util.*;
public class SwitchCaseExample1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=input.nextInt();
		
		
		System.out.println("Enter your Choice:\n For Check Prime Number press: 1 \n For Check Even odd Number press: 2 \n For Check Factoreal press: 3 \n For base power press: 4  ");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
			 int b=1; 
             int c=0; 
              while(b<= num) 
                 { 
                     if((num%b)==0) 
                        c=c+1; 
                        b++; 
                 } 
                  if(c==2) 
                  System.out.println(num +" is a prime number"); 
                  else 
                  System.out.println(num +" is not a prime number"); 
			break;
		case 2:
			if(num%2==0)
			{
				System.out.println(num+" Number is even");
				
			}
			else
			{
				System.out.println(num+" Number is odd");
			}
			break;
		case 3:
			int fact=1;
			for (int i=1; i<=num; i++)
			{
				fact=fact*i;
			}
			System.out.println("Number "+num+" Factoreal is: "+fact);
			break;
		case 4:
			int base,power,pow=1;
			power=num%10;
			base=(num/10)%10;
			System.out.println("base: "+base+" power: "+power);
			for(int i=1;i<=power;i++)
			{
				pow=pow*base;
				
			}
			System.out.println(pow);
			
			break;
		
		}

	}

}
