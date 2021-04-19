package CircularLinkedList;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first = null;
		last = first;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void addStudent(Student value) {
		Node newNode = new Node(value);
		Node currentNode = first;
		
		if(isEmpty()) {
			first  = last = newNode;
			last.setLink(first);
		}
		else {
			last.setLink(newNode);
			newNode.setLink(first);
			last = newNode;
		}
	}
	
	public void outputList() {
		Node currentNode = first;
		
		do {
			System.out.println(currentNode.getStudent());
			currentNode = currentNode.getLink();
		} while(currentNode != first);
	}

}
