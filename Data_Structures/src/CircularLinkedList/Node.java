package CircularLinkedList;

public class Node {
	private Student student;
	private Node link;
	
	public Node() {
		student = null;
		link = null;
	}
	
	public Node(Student student) {
		this.student = student;
		link = null;
	}
	
	public Node(Student student, Node link) {
		this.student = student;
		this.link = link;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
}
