
import java.util.*;
class Binary
{
public static void main(String[] args) 
	

{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the binary number to change into decimal: "); 
      String binary=sc.nextLine();
	
	System.out.println("equivalent decimal number is" +Integer.parseInt(binary,2));

}
}