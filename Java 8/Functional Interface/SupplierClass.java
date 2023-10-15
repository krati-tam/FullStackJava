package functionalInterface;

import java.util.function.Supplier;

public class SupplierClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> supplier =() -> "Supplier Example";
		System.out.println(supplier.get());
	}

}
