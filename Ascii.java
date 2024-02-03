import java.util.*;
class Ascii
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
          System.out.println ("enter the character");
           char ch= sc.next().charAt(0);
           int Asciivalue=ch;
           System.out.println ("Ascii value of character is:- " +Asciivalue);
       }
   }