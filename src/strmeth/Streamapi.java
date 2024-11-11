package strmeth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strmeths {

	public static void main(String[] args) {

	       List<Integer> numbers = Arrays.asList(8, 5, 7, 9, 10, 1, 5);
	       
	       Optional<Integer> max = numbers.stream().max(Integer::compare);
	       
	       System.out.println(max);
	       
	       
	      int x=  numbers.stream().max(Integer::compare).get();
	      System.out.println(x);
	
	
	       // Stream<Integer> peek = numbers.stream().peek(null);
	 
	       long count = numbers.stream().count();
	
	
	       System.out.println(count);
	
	       Set<Integer> collect = numbers.stream().sorted().collect(Collectors.toSet());
	       System.out.println(collect + "++++++++++++++++++++++++++++++++++++++");
	
	
	
	

		// 1. forEach - consumer - terminal

		// numbers.stream().forEach(num -> System.out.println(num));

		// numbers.stream().forEach(System.out::println);

		// numbers.stream().forEach(x->System.out.println(x*x));
	       
	       
	       
	       
	       
	       
	       
	       

		// 2. collect - collector - terminal - includes many methods

	//	List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

		// List<String> collList = fruits.stream().collect(Collectors.toList()); //
	       
	       
		// similar to toList there are many
		// methods toSet and many more

		// System.out.println(collList);
	       
	       

		// 3. map - functional - intermediate - transform each elements into new element
		// base

	List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);

		// List <Integer> sqroot =
		// numbers1.stream().map(num->num*num).collect(Collectors.toList());

		// System.out.println(sqroot);

		// List<Integer> f1=
		// fruits.stream().map(String::length).collect(Collectors.toList());

		// System.out.println(f1);

		// 4. flatMap - functional - intermediate - ex. flats List of Lists
		//List<List<Integer>> numberLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
			//	Arrays.asList(7, 8, 9);

		// List<Integer> flatLists =
		// numberLists.stream().flatMap(List::stream).collect(Collectors.toList());

		// System.out.println(flatLists);

		// 5. count - stpore or return in long - terminal - used to count elements

		// long counx = numbers1.stream().count();
		// System.out.println(counx);

		// 6 . filter - predicate - intermediate - used to evaluate boolean expression

		 List<Integer> evlist = numbers1.stream().filter(num->num%2==0).collect(Collectors.toList());
		 System.out.println(evlist);

		// List<Integer> odlist =
		// numbers1.stream().filter(num->num%2!=0).collect(Collectors.toList());
		// System.out.println(odlist);

		// 7. reduce - (optinal) binary - terminal - use to reduce - using
		// max,min,sum,reverse, comparesones, and many more methods

		// Optional<Integer> reduce = numbers1.stream().reduce((a,b)-> a+b);
		// System.out.println(reduce); // Optional[21] because this is Optional

		// or

		// Integer integervalue = numbers1.stream().reduce((a,b)-> a+b).get();
		// System.out.println(integervalue); // stored into integer op - 21

		// Integer orElse = numbers1.stream().reduce((a,b)-> a+b).orElse(0);
		// System.out.println(orElse); //21

		// Integer intmax = numbers1.stream().reduce(Integer::max).get();
		// System.out.println(intmax);

		// 8. Match - predicate - terminal operation - evaluate boolean expression -
		// output is in true/false

		// boolean allEven = numbers1.stream().allMatch(num -> num % 2 == 0 );
		// System.out.println(allEven);

		// boolean anyMatch = numbers1.stream().anyMatch(num -> num % 2 == 0 );
		// System.out.println(anyMatch);

		// 9. findAny findFirst - optional - terminal operation

		// Integer integer = numbers1.stream().filter(num->num%2==0).findAny().get();
		// System.out.println(integer);

		// Integer integer1 = numbers1.stream().filter(num->num%2==0).findFirst().get();
		// System.out.println(integer1);

		// 10. sum and avg - present in collect - Collectors

		// collect =
		// numbers1.stream().collect(Collectors.summingInt(Integer::intValue));
		// System.out.println(collect);

		// 11. joining -used with only char and strings - Terminal - pressent in collect
		// - Collectors

		// String sts = Stream.of("Suyash","Hailey").collect(Collectors.joining(" and
		// "));
		// System.out.println(sts);

		//List<String> fruits1 = Arrays.asList("Apple", "Banana", "Orange", "Mango");
		// String collect = fruits1.stream().collect(Collectors.joining(" and "));
		// System.out.println(collect);

		// 12. counting - count total elements - collect - Collectors method

		// Long collect = fruits1.stream().collect(Collectors.counting());

		// System.out.println(collect);

		// Long collect = numbers1.stream().collect(Collectors.counting());
		// System.out.println(collect);

		// 13. minBy , maxBy -- collect - Collectors - Terminal method - return optional
		// - use .get()
		// Integer minint =
		// numbers1.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
		// System.out.println(minint);

		// Integer maxint =
		// numbers1.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		// System.out.println(maxint);

		// To find min by reverse order
		// Integer integer =
		// numbers1.stream().collect(Collectors.minBy(Comparator.reverseOrder())).get();
		// System.out.println(integer);

		// 13. partitioningBy- collect - collectors - predicate - evaluate boolean
		// expression - return boolean

		// Map<Boolean, List<Integer>> map =
		// numbers1.stream().collect(Collectors.partitioningBy(num->num%2==0));

		// System.out.println(map);

		// List<Integer> list =
		// numbers1.stream().collect(Collectors.partitioningBy(num->num%2==0)).get(true);

		// System.out.println(list);

		// 14. Numeric Stream

		// for max , min , avg - this is optinal use get method for that

		// IntStream.range(1, 5).forEach(System.out::println); //op - 1 to 4 only

		// IntStream.rangeClosed(1, 5).forEach(System.out::println); // op- 1 to 5

		// int [] num = {5,6,7,8,9};

		// int sum = IntStream.of(num).sum();
		// System.out.println(sum);

		// List<String> strings = Arrays.asList("123", "456", "789");
		// int sumOfLengths = strings.stream()
		// .mapToInt(String::length) // Map each string to its length as an int
		// .sum(); // Calculate the sum of lengths
		// System.out.println("Sum of lengths: " + sumOfLengths);

		// Most imp and most asked
		// 15. groupingBy (mostly use with lists) - Terminal operation - function -
		// extract a data or object from existing data or object

		List<Person> plist = Arrays.asList(new Person("Suyash", 26), new Person("Hailey", 26), new Person("Doja", 30),
				new Person("Adriana", 38), new Person("Demoo", 16),
				new Person("Daemon", 52), new Person("Aemond", 16),
				new Person("Lucey", 12)
				);
		// Grouping By person by their age
		
		Map<Integer, List<Person>> pbyAge = plist.stream().collect(Collectors.groupingBy(Person::getAge));
		 System.out.println("=================");
		 System.out.println(pbyAge);
		 System.out.println("==================");

		// Group by Age and count them -- how manu persons by that age present

		//Map<Integer, Long> gByAge = plist.stream()
		//		.collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

	//	System.out.println(gByAge);

		//		Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
		
		//System.out.println(collect);
		 
		 

	}

}
