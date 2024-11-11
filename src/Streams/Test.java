package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		intlist.add(5);
		
		List<Integer> collect = intlist.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(collect);
		
		
		List<String> stringlist = new ArrayList<>();
		stringlist.add("Suyash");
		stringlist.add("Sayali");
		stringlist.add("Rashmi");
		stringlist.add("Alex");
		stringlist.add("Smita");
		stringlist.add("Daemon");
		
		List<String> list1 = stringlist.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
	
		System.out.println(list1);
		
		
		stringlist.stream().forEach(e->{
			
			System.out.println(e);
		});
		
		System.out.println("******************************************");
		
		stringlist.stream().sorted().forEach(System.out::println);
		
		
		
	}

}
