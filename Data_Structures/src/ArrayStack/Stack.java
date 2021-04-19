package ArrayStack;

public class Stack {
	
	private int size;
	private int top;
	private int[] intArray;
	
	public Stack(int size) {
		this.size = size;
		intArray =  new int[size];
		top = 0;
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
	
	public boolean isFull() {
		return (top == size);
	}
	
	public boolean push(int n) {
		if(top == size)
			return false;
		else {
			intArray[top] = n;
			top++;
			return true;
		}
	}
	
	public int pop() {
		assert(isEmpty());
		top--;
		return intArray[top];
	}
	
	public void initializeStack() {
		top = 0;
	}
	
	public int top() {
		assert (top == 0);
		return intArray[top-1];
	}
	
	public void outputStack() {
		if(top!=0)
			for(int i = top-1; i >= 0; i--) {
				System.out.println(intArray[i]);
			}
	}
	
//	public String reverse(String str) {
//		Stack stack = new Stack(str.length());
//		String output = "";
//		
//		for(int i = 0; i < str.length(); i++) {
//			stack.push(str.charAt(i));
//		}
//		
//		for(int i = 0; i < str.length(); i++) {
//			output += stack.pop();
//		}
//		
//		return output;
//	}

}
