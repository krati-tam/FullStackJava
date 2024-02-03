 class Pattern
{
  int i,j;
void triangle(char b)
{for(i=1;i<=5;i++)
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
          } 
 
class PatternMain
{
public static void main(String args[])
{ Pattern p = new Pattern();
 p.triangle('*');
 p.triangle(5);
 p.triangle();
 }
}
