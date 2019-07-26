import java.util.LinkedList; 
import java.util.Queue; 
public class Array {

	public static void main(String[] args)
	{ 
		Queue<String> q = new LinkedList<String>(); 
        
        // Enqueue the first binary number 
        q.add("1"); 
		int n=15;
		while(n-->0)
		{
			  String s1 = q.peek(); 
	            q.remove(); 
	            System.out.println(s1);
	            
	            // Store s1 before changing it 
	            String s2 = s1; 
	              
	            // Append "0" to s1 and enqueue it 
	            q.add(s1 + "0"); 
	              
	            // Append "1" to s2 and enqueue it. Note that s2 contains 
	            // the previous front 
	            q.add(s2 + "1");
		}
	}
}
