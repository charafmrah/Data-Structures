package DoublyLinkedList;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertAtFront(Student student) {
		Node newNode = new Node(student);
		
		if(isEmpty())
			first = last = newNode;
		else {
			if(first.getNext() == null) {
				newNode.setNext(first);
				first.setPrev(newNode);
				first = newNode;
			}
			else {
				newNode.setNext(first);
				newNode.setPrev(null);
				first.getNext().setPrev(newNode);
				first = newNode;
			}
		}
	}
	
	public void insertAtBack(Student student) {
		Node newNode = new Node(student);
		
		if(isEmpty()) 
			first = last = newNode;
		else {
			last.setNext(newNode);
			newNode.setPrev(last);
			newNode.setNext(null);
			last = newNode;
		}
	}
	
	public boolean removeFromFront() {
		if(isEmpty())
			return false;
		else {
			if(first.getNext() == null)
				first = last = null;
			else {
				first = first.getNext();
				first.getPrev().setNext(null);
				first.setPrev(null);
			}
		}
		return true;
	}
	
	public boolean removeFromBack() {
		if(isEmpty())
			return false;
		else {
			if(first.getNext()==null) {
				first = last = null;
			}
			else {
				last = last.getPrev();
				last.getNext().setPrev(null);
				last.setNext(null);
			}
		}
		return true;
	}
	
	public void outputList() {
		Node currentNode = first;
		while(currentNode != null) {
			System.out.println(currentNode.getItem());
			currentNode = currentNode.getNext();
		}
	}
	
	public void outputListBackward() {
		Node currentNode = last;
		while(currentNode != null) {
			System.out.println(currentNode.getItem());
			currentNode = currentNode.getPrev();
		}
	}
	
}
