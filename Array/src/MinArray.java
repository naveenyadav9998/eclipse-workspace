import java.util.Scanner;
public class MinArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size=input.nextInt();
		int arr[];
		arr=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element: ");
			arr[i]=input.nextInt();
		}
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Your elements: "+arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(min>arr[i])
			{
			
				min=arr[i];
			
			}		
		}
		
		System.out.println("Your min elements: "+min);
		input.close();
	}

}
