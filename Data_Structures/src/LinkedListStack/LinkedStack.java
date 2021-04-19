package LinkedListStack;

public class LinkedStack {
	
	private Node top;
	
	public LinkedStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void initializeStack() {
		top = null;
	}
	
	public void push(int newElement) {
		Node newNode = new Node(newElement);
		newNode.setLink(top);
		top = newNode;
	}
	
	public int top() {
		assert(top == null);
		return top.getInfo();
	}
	
	public boolean pop() {
		if(isEmpty()) {
			return false;
		} else {
			top = top.getLink();
			return true;
		}
	}
	
	public void outputLinkedStack() {
		Node currentNode = top;
		while(currentNode != null) {
			System.out.println(currentNode.getInfo());
			currentNode = currentNode.getLink();
		}
	}
	
	public void copyStack(LinkedStack otherStack) {
		top = otherStack.top;
	}
	
	public int size() {
		int count = 0;
		Node currentNode = top;
		while(currentNode != null) {
			count++;
			currentNode = currentNode.getLink();
		}
		return count;
	}

}
