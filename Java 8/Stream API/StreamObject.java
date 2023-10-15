package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class StreamObject {
	public static void main(String[] args) {
		
		
		Stream<Object>emptyStream=Stream.empty();
		emptyStream.forEach(e->
		{
			System.out.println(e);
		}
		);

		//int[] name= {1,3,4,5};
	
	IntStream stre=Arrays.stream(new int[]{1,3,4,5});
	stre.forEach(e-> {
		System.out.println(e);
	}
	);
	
	List<String>name=List.of("A","K","KP");
	List<String>newName=name.stream().map(e->e +"K").collect(Collectors.toList());
	System.out.println(newName);
}
}
