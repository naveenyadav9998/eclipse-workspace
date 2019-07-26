import java.util.*;
public class ArrayBubbleSort {

	public static void main(String[] args) 
	{
		int arr[];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n=input.nextInt();
		arr=new int[n];
		int size=arr.length;
		System.out.println("Enter the Element: ");
		
		
		for(int i=0;i<size;i++)
		{
			arr[i]=input.nextInt();
		}
		
		System.out.print("Your Element is: ");

		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<(size-1);i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				
				}
			}
			
				
		}
		System.out.print("Sorrted Element is: ");

		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
