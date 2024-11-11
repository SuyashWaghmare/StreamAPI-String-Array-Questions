package Streams;

import java.util.function.Predicate;

public class Functionalinter {
	
	public static void main(String[] args) {
		
		// Predicate
		
		  Predicate<Integer> lessthan = i->(i<20);
		  System.out.println(lessthan.test(19));
		
		
		
		
	}
	

}
