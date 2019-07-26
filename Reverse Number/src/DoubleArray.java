import java.util.*;
public class DoubleArray
{
	public static void main(String args[])
	{
		int  arr[][];
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter rows:");
		int row=input.nextInt();
		
		System.out.println("Enter Colums: ");
		int col=input.nextInt();
		arr=new int [row][col];
		
		System.out.println("Enter the element: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=input.nextInt();
			
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.println("Your element is: ["+i+"]["+j+"] \n" +arr[i][j]);
			}
		}
		
	}                                                     

}
