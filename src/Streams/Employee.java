package Streams;

public class Employee {

	private int eid;
	private String name;
	private String city;
	private double salary;
	
	

	public Employee(int eid, String name, String city, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

	
	
}
