import java.util.*;
public class ArrayOneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int m = input.nextInt();
		
		//Scanner input=new Scanner(System.in);
		System.out.println("Enter cols: ");
		int n = input.nextInt();
		arr=new int[m][n];
		int size=m*n;
		int b[];
		b=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.println("Enter the element: ");
				arr[i][j]=input.nextInt();
				
			}
		}
			int k=0;
			for( int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++) 
				{
					b[k]=arr[i][j];
					k++;
				}
			}
			System.out.println("element of 1 d Array is: ");
			for(int i=0;i<b.length;i++) 
			{
				System.out.println(b[i]);
				}
			
		}

	}


