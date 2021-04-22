package ArrayQueue;

public class Test {
	public static void main(String[] args) {
		Queue q = new Queue(10);
		int [] values = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		
		for(int i = 0; i < values.length; i++) {
			q.addQueue(values[i]);
		}
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(q.getFront());
			q.removeQueue();
		}
	}
}
