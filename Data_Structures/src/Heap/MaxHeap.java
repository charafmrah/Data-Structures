package Heap;

public class MaxHeap < T extends Comparable <? super T>> {
	private T [] heap; //array of the heap entries
	private int lastIndex; //the index of the last entry
	private static final int DEFAULT_INITIAL_CAPACITY = 25;
	
	public MaxHeap() { 
		this(DEFAULT_INITIAL_CAPACITY);
	}

	public MaxHeap(int initialCapacity) {
		T[] tempHeap = (T []) new Comparable [initialCapacity + 1];
		heap = tempHeap;
		lastIndex = 0;
	}
	
	public void add(T newEntry) {
		lastIndex++;
		int newIndex = lastIndex;
		int parentIndex = newIndex/2;
		
		while((parentIndex>0) && newEntry.compareTo(heap[parentIndex]) > 0) {
			heap[newIndex] = heap[parentIndex];
			newIndex = parentIndex;
			parentIndex = newIndex/2;
		}
		heap[newIndex] = newEntry;
	}
	
	public boolean isEmpty() {
		return lastIndex < 1;
	}
	
	public T removeMax() {
		T root = null;
		
		if(!isEmpty()) {
			root = heap[1]; // return value 
			heap[1] = heap[lastIndex]; // create a semiheap
			lastIndex--; //	decrease the size
			reheap(1); // transform to a heap
		}
		return root;
	}

	private void reheap(int rootIndex) {
		boolean done = false;
		T orphan = heap[rootIndex];
		int leftChildIndex = 2 * rootIndex;
		
		while(!done && (leftChildIndex <= lastIndex)) {
			int largerChildIndex = leftChildIndex; //assume larger
			int rightChildIndex = leftChildIndex + 1;
			if((rightChildIndex <= lastIndex) && heap[rightChildIndex].compareTo(heap[largerChildIndex]) > 0) {
				largerChildIndex = rightChildIndex;
			}
			if(orphan.compareTo(heap[largerChildIndex]) < 0) {
				heap[rootIndex] = heap[largerChildIndex];
				rootIndex = largerChildIndex;
				leftChildIndex = 2 * rootIndex;
			}
			else
				done = true;
		}
		heap[rootIndex] = orphan;
		
	}
	
}
