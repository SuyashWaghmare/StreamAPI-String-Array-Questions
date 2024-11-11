package arraysques;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arrayexp2 {
	public static void main(String[] args) {
		
		int [] array1 = {1,2,3,4,5};
		int [] array2 = {4,5,6,7,8};
		
		List<Integer> commonElement = Arrays.stream(array1).filter(number -> Arrays.stream(array2).anyMatch(arr2 -> arr2==number)).boxed().collect(Collectors.toList());
		
		System.out.println(commonElement);
		
		
		
		
	}

}
