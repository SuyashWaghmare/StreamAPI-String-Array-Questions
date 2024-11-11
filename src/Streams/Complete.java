package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Complete {

	public static void main(String[] args) {

		List<Employee> elist = new ArrayList<>();
		elist.add(new Employee(101, "Suyash", "Pune", 85000));
		elist.add(new Employee(102, "Daemon", "Ravet", 60000));
		elist.add(new Employee(103, "Alex", "Westores", 60000));
		elist.add(new Employee(104, "Aemond", "Ravet", 75000));

		// elist.sort((x,y)-> Double.compare(y.getSalary(), x.getSalary()));
//		for(Employee e :elist)
//		{
//			System.out.println(e);
//		}

	//	elist.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).forEach(e -> System.out.println(e));
		
		
		 // Group employees by city using Streams
		Map<String, List<Employee>> citywiselist = elist.stream().collect(Collectors.groupingBy(Employee::getCity));
		
		//Map<String, List<Employee>> citywiselist = elist.stream().collect(Collectors)
		
		System.out.println("************");
		
		System.out.println(citywiselist);
		
		System.out.println("************");
		

		
		
		// Fetch and print the employees in each city
		
		citywiselist.forEach((city,employees)-> { 
		System.out.println("city :"+ city); 
		employees.forEach(employee->System.out.println(employee.getName()));
		
		}
		);
		
//		int [] s = {1,2,3,4};
//		String p = "suyash";
	

		
	
		
                                                   
		

	}

}

