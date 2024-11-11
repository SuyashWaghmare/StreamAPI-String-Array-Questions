package strmeth;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int marks;
	private String gender;
	private String div;

	public Student() {
		super();
		// TODO Auto-generated constructor stub

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", gender=" + gender + ", div=" + div
				+ "]";
	}

	public Student(int id, String name, int marks, String gender, String div) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
		this.div = div;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.getMarks(), this.getMarks());
	}

}
