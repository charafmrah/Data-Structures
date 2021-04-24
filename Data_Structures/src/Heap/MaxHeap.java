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
	
}
