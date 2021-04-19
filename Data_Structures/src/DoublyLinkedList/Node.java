package DoublyLinkedList;

public class Node {
	
	private Student item;
	private Node prev;
	private Node next;
	
	public Node(Student item) {
		super();
		this.item = item;
	}
	public Node(Student item, Node next) {
		super();
		this.item = item;
		this.next = next;
	}
	
	public Node(Student item, Node prev, Node next) {
		super();
		this.item = item;
		this.prev = prev;
		this.next = next;
	}
	
	public Student getItem() {
		return item;
	}
	public void setItem(Student item) {
		this.item = item;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
