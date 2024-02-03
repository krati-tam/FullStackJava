import java.util.*;
import java.io.*;
class Duplicate
{
static int duplicacy(int a[],int n)
{
	int res=1;
	for(int i=1;i<n;i++)
{
	if(a[res-1] !=a[i])
	{
	a[res]=a[i];
	res++;
	}
}
return res;
}
public static void main(String args[])
{ int n=6;
int a[] = {10,20,30,30,30,40,40};  
for(int i=1;i<n;i++)
{
	System.out.println(a[i]+ " ");
}
	System.out.println();
	n =duplicacy(a,n);
for(int i=1;i<n;i++)
{
	System.out.println(a[i]+ " ");
}
}
}