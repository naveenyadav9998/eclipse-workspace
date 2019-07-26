import java.util.*;
public class LeftArray 
{

	public static void main(String[] args) 
	{
		int arr[];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of Array");
		int size=input.nextInt();
		
		System.out.println("Enter the Element: ");
		arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<(size-1);i++)
		{
			System.out.println("i size "+arr[i]);
			for(int j=0;j<size-i-1;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					System.out.println("j size "+arr[j]);
				}
			}
			
				
		}
		System.out.print("Sorrted Element is: ");

		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
			
		}

	}

}
