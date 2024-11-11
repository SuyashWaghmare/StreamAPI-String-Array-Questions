package strmeth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Topper {

	public static void main(String[] args) {

		List<Student> stu = new ArrayList<>();
		stu.add(new Student(101, "Suyash", 97, "Male", "A"));
		stu.add(new Student(102, "Shreyash", 87, "Male", "A"));
		stu.add(new Student(103, "Renerya", 78, "Female", "A"));
		stu.add(new Student(104, "Daemon", 78, "Male", "B"));
		stu.add(new Student(105, "ABC", 88, "Female", "B"));
		stu.add(new Student(106, "XYZ", 45, "Male", "B"));
		stu.add(new Student(107, "PQR", 35, "Female", "C"));
		stu.add(new Student(108, "LMN", 80, "Male", "C"));
		stu.add(new Student(109, "CDB", 91, "Female", "C"));
		stu.add(new Student(110, "OTR", 23, "Male", "A"));

		Map<String, Optional<Student>> collect = stu.stream().collect(
				Collectors.groupingBy(Student::getDiv, Collectors.maxBy(Comparator.comparingInt(Student::getMarks))));

		for (Entry<String, Optional<Student>> st : collect.entrySet()) {

			Optional<Student> values = st.getValue();

			Student student = values.get();

			System.out.println("Topper Student from division " + student.getDiv() + "  " + "Student Name : "
					+ student.getName() + "  " + "Student Marks :" + student.getMarks());

		}

		List<Student> divA = new ArrayList<>();
		List<Student> divB = new ArrayList<>();
		List<Student> divC = new ArrayList<>();

		for (Student st : stu) {
			if (st.getDiv() == "A") {
				divA.add(st);
				Collections.sort(divA);

			}
			if (st.getDiv() == "B") {
				divB.add(st);
				Collections.sort(divB);
			}
			if (st.getDiv() == "C") {
				divC.add(st);
				Collections.sort(divC);
			}
		}

		System.out.println("Topper of Division A: " + divA.get(0));

		System.out.println("Topper of Division B: " + divB.get(0));

		System.out.println("Topper of Division C: " + divC.get(0));

		
		System.out.println("========================================================");
		
		// Another way

		Map<String, List<Student>> divisionMap = new HashMap<>();
		divisionMap.put("A", new ArrayList<>());
		divisionMap.put("B", new ArrayList<>());
		divisionMap.put("C", new ArrayList<>());

		for (Student st : stu) {
			if (divisionMap.containsKey(st.getDiv())) {
				divisionMap.get(st.getDiv()).add(st);
			}
		}

		for (List<Student> div : divisionMap.values()) {
			Collections.sort(div);
		}

		System.out.println("Topper of Division A: " + divisionMap.get("A").get(0));

		System.out.println("Topper of Division B: " + divisionMap.get("B").get(0));

		System.out.println("Topper of Division C: " + divisionMap.get("C").get(0));
	}

}
