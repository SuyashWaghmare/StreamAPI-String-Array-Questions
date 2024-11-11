package strmeth;
import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {

		Map<Integer, Student> map = new HashMap<>();
		map.put(101, new Student(1, "Suyash", 99, "Male", "A"));
		map.put(102, new Student(2, "Shreyash", 45, "Male", "B"));
		map.put(103, new Student(3, "Suyash", 40, "Male", "C"));
		map.put(104, new Student(4, "Alexa", 88, "Female", "A"));
		map.put(105, new Student(5, "Renerya", 99, "Female", "B"));

		System.out.println(map);

		Map<String, List<Student>> groupedByName = map.values().stream()
                .collect(Collectors.groupingBy(Student::getName));
		
		//System.out.println(groupedByName);
		
		
		 groupedByName.forEach((name, students) -> {
	            System.out.println("sort with name " + name + ":");
	            students.forEach(System.out::println);
	        });
	}

}
