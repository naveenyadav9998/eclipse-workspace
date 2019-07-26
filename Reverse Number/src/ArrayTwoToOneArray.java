import java.util.*;
public class ArrayTwoToOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][],b[],array[][];
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Rows: ");
		int m = input.nextInt();
		
		System.out.println("Enter cols: ");
		int n = input.nextInt();
		
		System.out.println("Enter Second Rows: ");
		int r = input.nextInt();
		
		System.out.println("Enter Second cols: ");
		int c = input.nextInt();
		
		array=new int[r][c];
		
		arr=new int[m][n];
		int size=(r*c)+(m*n);
		b=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.println("Enter the element: ");
				arr[i][j]=input.nextInt();
				
			}
		}
		
		
		/*System.out.println("Enter Rows: ");
		int p = input.nextInt();
		System.out.println("Enter cols: ");
		int q = input.nextInt();
		array=new int[p][q];*/
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++) 
			{
				System.out.println("Enter the element: ");
				array[i][j]=input.nextInt();
				
			}
		}
		int k=0;
		for (int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
			b[k]=arr[i][j];
			System.out.print(b[k]);
			}
		}
		for (int i=0; i<array.length;i++)
		{
			for(int j=0; j<array[i].length;j++)
			{
				
			b[k]=array[i][j];
			
			System.out.print(b[k]);
			}
		}

	}

}
