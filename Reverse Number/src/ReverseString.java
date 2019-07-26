
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Gwalior");
		String rev=new String();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);

	}

}
