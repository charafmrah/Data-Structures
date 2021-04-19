package LinkedListStack;

public class Test {
	
	public static void main(String[] args) {
		LinkedStack a = new LinkedStack();
		a.push(11);
		a.push(13);
		a.push(25);
		a.push(12);
		a.push(15);
		System.out.println("a:");
		a.outputLinkedStack();
		System.out.println(a.top());
		a.pop();
		System.out.println("a:");
		a.outputLinkedStack();
	}

}
