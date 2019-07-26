import java.util.*;
public class MaxArray 
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
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Your elements: "+arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];	
			}		
		}
		System.out.println("Your max elements: "+max);
		input.close();
	}

}
