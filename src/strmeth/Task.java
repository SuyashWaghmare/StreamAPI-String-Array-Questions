package strmeth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task {
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 3, 5 };
		int[] array2 = { 4, 5, 7, 7, 8 };
		int[] array3 = { 1, 2, 2, 4, 5 };
		
		// using Hashset

		Set<Integer> set1 = new HashSet<>();

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++)

			{

				if (array1[i] == array2[j]) {

					for (int k = 0; k < array3.length; k++) {

						if (array1[i] == array3[k]) {

							set1.add(array1[i]);
						}

					}
				}
			}
		}

		System.out.println(set1);

		// using java8

		// array1 ---> filter -> array2 --> filter --> arary3 filter - anyMatch

		List<Integer> commonElement = Arrays.stream(array1)
				.filter(number -> Arrays.stream(array2).anyMatch(arr2 -> arr2 == number))
				.filter(number -> Arrays.stream(array3).anyMatch(arr3 -> arr3 == number)).boxed()
				.collect(Collectors.toList());
		System.out.println(commonElement);
		   
		
		// Using for loop only 
		
		int[] newArray = new int[array1.length];  // Auxiliary array to store common elements
        int newIndex = 0;  // Index to keep track of the number of elements in the result array

        for (int i = 0; i < array1.length; i++) {                  // Loop through each element of array1
        	
            for (int j = 0; j < array2.length; j++) {                // For each element in array1, loop through each element of array2
            	
                if (array1[i] == array2[j]) {                     // If array1[i] is found in array2
                	
                    for (int k = 0; k < array3.length; k++) {         // Loop through each element of array3
                    	
                        if (array1[i] == array3[k]) {             // If array1[i] is also found in array3
                        	
                            boolean isDuplicate = false;        // Check if array1[i] is already in newArray to avoid duplicates
                            
                            for (int l = 0; l < newIndex; l++) {     // Loop through newArray to see if array1[i] is already added
                            	
                                if (newArray[l] == array1[i]) {     // If found in newArray, mark it as a duplicate
                                	
                                    isDuplicate = true;
                                    break;
                                }
                            }
                            
                            // If array1[i] is not a duplicate, add it to newArray
                            if (!isDuplicate) {
                            	newArray[newIndex++] = array1[i];
                            }
                        }
                    }
                }
            }
        }

        // Print the result array without trailing zeroes
       // System.out.print("[");
        for (int i = 0; i < newIndex; i++) {
            System.out.print(newArray[i]);
            if (i < newIndex - 1) {
                System.out.print(", ");
            }
        }
      //  System.out.println("]");
        
       
    }

	}


