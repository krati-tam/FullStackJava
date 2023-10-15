package defaultMethods;

public interface Vehicles {

	void drive();
	

	default void speedMeter()
	{
		System.out.println("Common speed ");
	}
	
	static void brake ()
	{ 
		System.out.println("power break ");
		
	}
}
