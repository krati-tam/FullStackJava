
import java.util.*;
class PalindromeNum
{
	public static void main(String args[])
	    {
	    	int rev = 0, remainder;
Scanner sc=new Scanner (System.in);
System.out.println("enter the number");
int n = sc.nextInt();
   

                 
             while (n != 0) {
                remainder = n % 10;
                 rev = rev * 10 + remainder;
              n /= 10;
      }
          System.out.println("Reversed number = %d", rev);

	

}
}