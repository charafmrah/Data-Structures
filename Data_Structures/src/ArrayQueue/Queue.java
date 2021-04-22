package ArrayQueue;

public class Queue {
	private int front;
	private int back;
	private int size;
	private int capacity;
	private int[] array;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		size = 0;
		front = back = 0;
		array = new int[capacity];
	}
	
	public boolean isFull(Queue queue) {
		return (queue.capacity == queue.size);
	}
	
	public boolean isEmpty() {
		return(size == 0);
	}
	
	public void addQueue(int item) {
		if(isFull(this))
			return;
		this.back = (this.back + 1) % this.capacity;
		this.array[this.back] = item;
		this.size++;
		System.out.println(item + " was added to the queue");
	}
	
	public int removeQueue() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		int item = this.array[front];
		this.front = (this.front + 1) % this.capacity;
		this.size++;
		return item;
	}
	
	public int getFront() {
		if(isEmpty()) 
			return Integer.MIN_VALUE;
		else
			return array[this.front];
	}
	
	public int getBack() {
		assert(isEmpty());
		return array[this.back];
	}
}
