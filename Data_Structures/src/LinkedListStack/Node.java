package LinkedListStack;

public class Node {
	private int info;
	private Node link;
	
	public Node() {
		link = null;
		info = 0;
	}
	
	public Node(int newInfo) {
		this.info = newInfo;
		link = null;
	}
	
	public Node(int newInfo, Node link) {
		this.info = newInfo;
		this.link = link;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
	
	
}
