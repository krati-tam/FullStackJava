 class Pattern
{
  int i,j;
void triangle(char b)
{for(i=5;i>0;i--)
{    for(j=1;j<=i;j++)
       System.out.print(b);
       System.out.println(" ");
}
}
void triangle(int r)
{for(i=1;i<=r;i++)
{    for(j=1;j<=i;j++)
       System.out.print(j);
       System.out.println(" ");
}
}

void triangle()
{for(i=1;i<=5;i++)
{    for(j=1;j<=i;j++)
       System.out.print(i);
       System.out.println(" ");
}
}
 void triangle(String c)
{    int i,s,k;
 for(i=1;i<=5;i++)                      //for row
	{ for(s=1;s<=5-i;s++)                 //for space
		 System.out.print("  ");          
                {  for(k=1;k<=(2*i-1);k++)      //for column
		 System.out.print(c);
		System.out.println("  ");
	       } }
       }  } 
 
class PatternMain
{
public static void main(String args[])
{ Pattern p = new Pattern();
 p.triangle('*');
 p.triangle(5);
 p.triangle();
p.triangle("* ");
 }
}
