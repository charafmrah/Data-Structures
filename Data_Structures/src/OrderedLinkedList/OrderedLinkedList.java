package OrderedLinkedList;

public class OrderedLinkedList {
	private Node first;
	private Node last;
	
	public OrderedLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insert(Student itemName) {
		Node newNode = new Node(itemName);
		Node currentNode = first;
		Node previous = null;
		
		if(isEmpty())
			first = last = newNode;
		else {
			if(first.getItem().getFullName().compareTo(newNode.getItem().getFullName()) > 0) {
				newNode.setLink(first);
				first = newNode;
			} 
			else {
				while(currentNode != null) {
					if(currentNode.getItem().getFullName().compareTo(newNode.getItem().getFullName()) > 0) {
						previous.setLink(newNode);
						newNode.setLink(currentNode);
						break;
					}  else if(currentNode == last) {
						last.setLink(newNode);
						newNode.setLink(null);
						break;
					}
					previous = currentNode;
					currentNode = currentNode.getLink();
				}
			}
		}
	}
	
	public int size() {
		Node currentNode = first;
		int count = 0;
		while(currentNode!=null) {
			count++;
			currentNode = currentNode.getLink();
		}
		return count;
	}
	
	public boolean search(Student target) {
		Node currentNode = first;
		if(isEmpty())
			return false;
		else {
			while(currentNode != null) {
				if(currentNode.getItem() == target) {
					return true;
				}
				currentNode = currentNode.getLink();
			}
		}
		return false;
	}
	
	public void outputList() {
		Node currentNode = first;
		while(currentNode != null) {
			System.out.println(currentNode.getItem());
			currentNode = currentNode.getLink();
		}
	}
	
}
