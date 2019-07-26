import java.util.*;
import java.util.Arrays;
public class ArrayInput {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int array[],i;
		Scanner input=new Scanner(System.in);
		System.out.print("enter size of Array: ");
		int size=input.nextInt();
		array=new int[size];
		for(i=0;i<array.length;i++)
		{
			System.out.println("Enter the element: ["+i+"]");
			array[i]=input.nextInt();
		}
		
		for(i=0;i<array.length;i++)
		{
			System.out.println("Array element: ["+i+"]\n"+array[i]);
			
		}
		
	}

}
