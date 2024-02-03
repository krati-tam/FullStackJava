
import java.util.*;
class Factors
{
	public static void main(String args[])
	    {
	    	int i,n; 
	    	Scanner sc = new Scanner(System.in);
          System.out.println ("enter the number");
          n= sc.nextInt();
          System.out.println("factors of given Number is: ");  
for(i=1;i<=n;i++)
{ if (n%i==0)
   System.out.println (i);
  }
 
}
}