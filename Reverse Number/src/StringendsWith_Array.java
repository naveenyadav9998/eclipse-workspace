import java.util.*;
class StringendsWith_Array
{
	public static void main(String args[])
	{
		String arr[];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		
		int x=input.nextInt();
		arr=new String[x];

		System.out.println("Enter the Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.next();
		}
		 System.out.print("Enter ending string: ");
			String s=input.next();
			
		for(int i=0;i<arr.length;i++)
				{
					
					if(arr[i].endsWith(s))
					{
						System.out.println("Your Element is:["+i+"]"+arr[i]);
						
					}
					
					
		}
	}
}
