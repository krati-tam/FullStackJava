package functionalInterface;

import java.util.function.Predicate;

public class PredicateClass{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Predicate<String> checkLength=str ->str.length()==5;
   
	System.out.println(checkLength.test("Krati"));
	}

}
