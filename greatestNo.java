import java.util.*;
class greatestNo
{
public static void main(String arg [] ) 
{
Scanner sc=new Scanner (System.in);
System.out.println("enter three numbers to check greatest no.:  ");
int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt();
if(x>=y)
{ if(x>=z)
System.out.println(x+ " is greatest");
else 
System.out.println(z+ " is greatest");
}
else 
if(y>=z)
System.out.println(y+ " is greatest");
else 
System.out.println(z+ " is greatest");

}
}