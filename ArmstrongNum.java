
import java.util.*;
class PalindromeNum
{
	public static void main(String args[])
	    {
	    	int revNum = 0, remainder, orgNum;
Scanner sc=new Scanner (System.in);
System.out.println("enter the number");
int n = sc.nextInt();
   
    orgNum = n;


    while (n != 0) 
{
        remainder = n % 10;
        revNum = revNum * 10 + remainder;
        n /= 10;
    }

        if (orgNum == revNum)
     System.out.println (orgNum+ " is a palindrome");
    else
     System.out.println (orgNum+ "is not a palindrome");

	

}
}