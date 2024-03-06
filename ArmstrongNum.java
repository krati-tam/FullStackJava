
import java.util.*;
class PalindromeNum
{
public static void main(String args[])
{
	    	
Scanner sc=new Scanner (System.in);
System.out.println("enter the number");
int n = sc.nextInt();
    
    temp = n;
int sum=0;

    while (n > 0) 
{
        int d = n % 10;
	 n /= 10;
	  Sum = Sum * 10 + (d*d*d);
    }

        if (orgNum == revNum)
     System.out.println (orgNum+ " is a palindrome");
    else
     System.out.println (orgNum+ "is not a palindrome");

	

}
}
