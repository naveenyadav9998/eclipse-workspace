import java.util.*;
public class ArraySum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int array[];
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=input.nextInt();
		array=new int[size];
		
		int sum=0;
		
		for (int i=0;i<array.length;i++)
		{
			System.out.println("Enter the element: ");
			array[i]=input.nextInt();
			
		}
		
		
		for(int i=0;i<array.length;i++)
		{
			
			System.out.println("Array Element Is: "+array[i]);
			sum=sum+array[i];
			
		}
		
		System.out.println("the sum is: "+sum);

	}

}
