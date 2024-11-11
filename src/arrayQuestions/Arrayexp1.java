package arraysques;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Arrayexp1 {

	// To find Second smallest number
	public static void main(String[] args) {

		int[] numbers = { 5, 4,2, 8, 3, 1, 1 }; // 1 2 3 4 5 8 
		
		
        // Second number in the array 
		int secondSmallestElement = Arrays.stream(numbers).distinct().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Array does not have a smallest element"));
        System.out.println(secondSmallestElement);
		
        
        // Second smallest number in the array 
		int secondSm = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().getAsInt();
		System.out.println(secondSm);

		
		
		

	}

}
