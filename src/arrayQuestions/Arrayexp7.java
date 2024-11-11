package arraysques;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Arrayexp7{
    public static void main(String[] args) {
    	 
    	// 7. To find second largest element
    	
        int[] numbers = {5, 2, 8, 3, 1, 1};
        
        List<Integer> list = Arrays.asList(5, 2, 8, 3, 1, 1);

        // Sort the array in descending order
        int secondLargestElement = Arrays.stream(numbers)
                .distinct() // Remove duplicates
                .boxed()    // Convert int to Integer
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .skip(1)    // Skip the first element (largest)
                .findFirst() // Find the second largest element
                .orElseThrow(() -> new IllegalArgumentException("Array does not have a second largest element"));

        System.out.println("Second largest element: " + secondLargestElement);
        
        System.out.println("*******************************************");
        
        // or 
       
       Integer i = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(i);
        
        System.out.println("*******************************************");
       
        // 8. Sort Acending 
        
        // Sorting the array in ascending order 
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
        
        System.out.println("*******************************************8");
        
        // Sorting the array in ascending order using Java 8
        Arrays.stream(numbers)
              .sorted()
              .forEach(num -> System.out.print(num + " "));
        System.out.println(); // Add a newline after printing ascending order
        
        System.out.println("*******************************************");
        
        // Sorting the array in ascending order using Java 8 with method reference
        Arrays.stream(numbers)
              .sorted()
              .forEach(System.out::print);
        System.out.println(); // Add a newline after printing ascending order
        
        System.out.println("*******************************************88");

        // notes of sm
        List<Integer> acendingList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(acendingList);
        
        System.out.println("*******************************************sm");
        
        // 9.Sort by Decending
        
        // notes of sm
        List<Integer> decendingList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(decendingList);
        
        System.out.println("*******************************************");
        
        // Sorting the array in descending order
        int[] descendingArray = new int[numbers.length];
        for (int i1 = 0; i1 < numbers.length; i1++) {
            descendingArray[i1] = numbers[numbers.length - 1 - i1];
        }
        System.out.println("Array in descending order: " + Arrays.toString(descendingArray));
        
        System.out.println("*******************************************");
        
     // Sorting the array in descending order using Java 8
        Arrays.stream(numbers)
              .boxed() // Convert primitive int to Integer objects
              .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
              .forEach(num -> System.out.print(num + " "));
        
        System.out.println("*******************************************");
        
     // Sorting the array in descending order using Java 8 with method reference
        Arrays.stream(numbers)
              .boxed() // Convert primitive int to Integer objects
              .sorted(Comparator.reverseOrder()) // Sort in descending order
              .forEach(System.out::print);
        
        System.out.println();
        System.out.println("***********************************");
        
        // 9. Common element 
        
        // notes of sm
        
          List<Integer> list1 = Arrays.asList(5, 2, 8, 3, 1, 1);
          List<Integer> list2 = Arrays.asList(6, 1, 7, 9, 5, 4);
          
          list1.stream().filter(list2::contains).forEach(System.out::println);
          
          System.out.println("*******************************************");
         
         List<String> list3 = Arrays.asList("Suyash","Daemon","Adriana","Hailey","Jordon");
         List<String> list4 = Arrays.asList("Adriana","Chico","Suyash","Rhenerya","Bella");
         
         list3.stream().filter(list4::contains).forEach(System.out::println);
         
         System.out.println("*******************************************smsm");
         
      // 10. Remove duplicates
         
         List<Integer> list5 = list.stream().distinct().collect(Collectors.toList());
         System.out.println(list5);
         
         System.out.println("*******************************************");
         
       // 11. Find Duplicates
         
         
         // notes of sm
         Set<Integer> set = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
         System.out.println(set);
         
         System.out.println("*******************************************");
         
         // best way accoring to complexity
         
       
         Map<Integer, Long> frequencyMap = list.stream()
                                              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

         Set<Integer> duplicates = frequencyMap.entrySet().stream()
                                                .filter(entry -> entry.getValue() > 1)
                                                .map(Map.Entry::getKey)
                                                .collect(Collectors.toSet());
         

         System.out.println(duplicates);
         
         System.out.println("*******************************************");
         
         //array duplicate
         
         Set<Integer> set1 = new HashSet<>();
         Set<Integer> duplicates1 = new HashSet<>();

         for (int number : numbers) {
             if (!set1.add(number)) {
                 duplicates1.add(number);
             }
         }

         System.out.println("Duplicates in the array: " + duplicates1);

         
         
         
                     
    }
}
