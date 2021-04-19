package SinglyLinkedList;

public class Node {
	
	private int value;
	public Node next;
	
	public Node() {
		
	}
	
	public Node(int number) {
		this.value = number;
		next = null;
	}
	
	public Node(int number, Node next) {
		this.value = number;
		this.next = next;
	}
	
	public int getStudent() {
		return this.value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLink() {
		return next;
	}

	public void setLink(Node next) {
		this.next = next;
	}
	
	
}
