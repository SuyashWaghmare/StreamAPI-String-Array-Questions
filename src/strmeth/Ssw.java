package strmeth;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ssw {
	
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("alpha","beta","gamma");
		Map<Integer, List<String>> collect = strings
		          .stream()
		          .collect(Collectors.groupingBy(String::length));
		
		System.out.println(collect);
		
		
		List<String> strings1 = Arrays.asList("alpha","beta","gamma");
		List<String> collect2 = strings1
		       .stream()
		       .collect(Collectors.toUnmodifiableList());
		// output: ["alpha","beta","gamma"]
		
	}

}
