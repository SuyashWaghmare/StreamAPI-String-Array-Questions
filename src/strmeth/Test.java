package strmeth;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(5, 4);
		map.put(3, 99);
		map.put(4, 4);
		map.put(2, 55);
		map.put(6, 6);
		map.put(8, 7);
		map.put(7, 8);
		map.put(9, 9);
		map.put(10, 10);

		System.out.println(map);
		System.out.println("========================");

		Set<Integer> keyset = map.keySet();

		int sum = 0;

		for (Integer key : keyset) {
			sum += key;
			// map.get(set);

		}

		System.out.println(sum);
		System.out.println("========================");

		// using Java 8

		int sumTotal = map.keySet().stream().mapToInt(Integer::intValue).sum();
		System.out.println(sumTotal);
		
		
		
		// sort map
		System.out.println("========================");
		List<Integer> list = new ArrayList<>(keyset);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		int [] array = {1,2,3,4,5};
	     
	      
		
		
		
		

	}
	
	
	

}
