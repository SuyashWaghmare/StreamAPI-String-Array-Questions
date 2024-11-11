package arraysques;

import java.util.Arrays;

public class Arrayexp4 {
	public static void main(String[] args) {
		
		String [] fruits = {"Apple", "Banana", "Avocado","Apricot","Grapes"};
		
		int longestfruit = Arrays.stream(fruits).mapToInt(String::length).max().orElse(0);
		
		System.out.println(longestfruit);
		
		
		
		
		
	}

}
