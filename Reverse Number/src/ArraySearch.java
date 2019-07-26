import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[],i,search,status=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = input.nextInt();
		a=new int[size];
		System.out.print("Enter Element in array");
		for ( i=0; i<a.length; i++)
		{

			a[i]=input.nextInt();
			System.out.println("Element at index " + i + " : "+ a[i]);

		}
		System.out.println("Search element: ");
	     search = input.nextInt();
	     for(i = 0; i<size; i++)
		         {
		             if(a[i] == search)
		             {
		                 status = 1;
		                 break;
		             }
		             else
		             {
		                 status = 0;
		             }
		         }
		         if(status == 1)
		         {
		             System.out.println("Element found at position:"+(i + 1));
		         }
		         else
		         {
		             System.out.println("Element not found");
		         }

	}

}
