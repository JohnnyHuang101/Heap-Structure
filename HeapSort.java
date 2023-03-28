package heaps;

import timing.Algorithm;
import timing.Ticker;

/**
 * Implements an array sort by inserting all elements into a
 * MinHeap and repeatedly extracting the minimum element.
 * Used for performance testing of MinHeap implementation.
 *
 */
public class HeapSort implements Algorithm<Integer[],Integer[]> {
	
	private Integer[] originalArray, sortedArray;
	private MinHeap<Integer, Integer> heap;
	private Ticker ticker;
	
	public HeapSort() {
		
	}

	@Override
	public void reset(Ticker ticker) {
		this.ticker = ticker;
		this.heap = new MinHeap<Integer, Integer>(originalArray.length, ticker);
		this.sortedArray = new Integer[originalArray.length];
	}

	@Override
	public void run() {
		for (Integer num : originalArray) {
			heap.insert(num, num);
			ticker.tick();
		}
		int i=0;
		while(heap.isEmpty() == false) {
			int next = heap.extractMin().getElement();
			sortedArray[i++] = next;
			ticker.tick();
		}
	}

	@Override
	public void loadInput(Integer[] input) {
		this.originalArray = input;
	}

	@Override
	public Integer[] getResults() {
		return this.sortedArray;
	}
	
	public String toString() {
		return originalArray == null ? "Heapsort" :
			"Heapsort of " + originalArray.length + " integers";
	}

}
