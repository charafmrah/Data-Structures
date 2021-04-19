package CircularLinkedList;

public class Student {
	private int id;
	private String fullName;
	private double gpa;
	
	public Student(int id, String fullName, double gpa) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", gpa=" + gpa + "]";
	}
	
	
}
