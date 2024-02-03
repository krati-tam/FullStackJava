import java.util.*;
class EvenNum
{public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
int oddSum=0;
int evenSum=0;
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
		if(i%2==0)
 evenSum=evenSum+1;
	
	else
 oddSum=oddSum+1;
}
System.out.println("sum of all even number is even: "+evenSum);
System.out.println("sum of all odd number is odd: " +oddSum);

}
}