package OrderedLinkedList;

public class Node {
	private Student item;
	private Node link;
	
	public Node() {
		item = null;
		link = null;
	}
	
	public Node(Student item) {
		this.item = item;
		link = null;
	}
	
	public Node(Student item, Node link) {
		this.item = item;
		this.link = link;
	}

	public Student getItem() {
		return item;
	}

	public void setItem(Student item) {
		this.item = item;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
	
	
}
