package arraysques;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Arrayexp3 {
	public static void main(String[] args) {
		// To reverse an array in-place (without creating new array)
		
		
		int [] arr = {1,2,3,4,5};
		
		IntStream.range(0, arr.length/2).forEach(i -> {
			 int temp = arr[i];
			 
			 arr[i]= arr[arr.length-i-1];
			 
			 arr[arr.length-i-1]= temp;
			
			
			
		});
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
	}

}
