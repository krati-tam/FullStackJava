import java.util.*;
class Celsius
{
public static void main(String args[])
{System.out.println("enter the celsius temperature");
 Scanner sc =new Scanner (System.in);
int n=sc.nextInt();
double F;
F = (n*9/5)+ 32;
System.out.println("temperature in fahrenheit:-  " +F);
}
}