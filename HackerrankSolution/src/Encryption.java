import java.util.*;
import java.math.*;

public class Encryption 
{

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      Double a = Math.sqrt(s.length());
      int r =(int) Math.floor(a);
      int c =(int) Math.ceil(a);
      int count=0;
      char ar[] = s.toCharArray();
      
      for(int i=0; i<c; i++)
      {
    	  int j = i;
    	  while(j<s.length())
    	  {
    		  System.out.print(ar[j]);
    		  j += c;
    		  count++;
    	  }
    	  System.out.println(" ");
      }
	}

}
