
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string: ");
        String s = scan.nextLine();
        // Write your code here.
        int count=0;
       
        for(int i=0;i<=s.length()-1;i++)
        {
        int x=s.charAt(i);
        if(x==32)
        {
        	System.out.println(""+s.charAt(i));
            count++;
        }
       
        }
        System.out.println(count+1);
        for(int i=0;i<=s.length()-1;i++)
        {
       
        
        	System.out.print(""+s.charAt(i));
        
        }
    }
}
    

