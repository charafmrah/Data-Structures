package ArrayStack;

public class Test {
	
	public static void main(String[] args) {
		
		Stack s1 = new Stack(10);
		Stack s2 = new Stack(10);
		int i;
		
		for(i = 0; i<16; i+=2) {
			s2.push(i++);
		}
		
		for(i = 0; i<3; i++) {
			s1.push(s2.top());
			s2.pop();
		}
		s1.outputStack();
		
		
	}

}
