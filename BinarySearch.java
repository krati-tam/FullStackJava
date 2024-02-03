
import java.util.*;
class BinarySearch
{
	public static void main(String args[])
	{ int a[]={10,20,30,40,50};  
		int n=a.length;
		int x = 30;
		int low=0;
	int high=(n-1);
		int mid=(low + high)/2;
	
	while(low<=high)
	{
		if(a[mid]==x)
		{
			 System.out.println("element found at index" +mid);
			 break;
		}
else 
	if(a[mid]>x)
{
	high=mid-1;
}
else
{
	low =mid+1;
}
mid=(low + high)/2;
}
}
}