package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list1=List.of(12,3,52,27,81);
		List<Integer>result = new ArrayList<Integer>();
		//List names = Arrays.asList("Reflection","Collection","Stream");
	 result = list1.stream().sorted().collect(Collectors.toList());
	
	
	System.out.println(result);
}
}
