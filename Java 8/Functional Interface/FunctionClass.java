package functionalInterface;

import java.util.function.Function;

public class FunctionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function <Integer,String> getInt = t -> t*10 +" data multiplied by 10";
		
		System.out.println(getInt.apply(4));
	}

}
