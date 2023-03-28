package heaps;

/**
 * A "min priority queue".
 * 
 * The item with the highest priority is the one with the minimum value according to the Comparable interface.
 * 
 * @param <E> The type of the element (data) contained in the priority queue
 * @param <P> The type being used for priorities
 * 
 * DONE: DO NOT CHANGE THIS FILE
 */
public interface MinPriorityQueue<E, P extends Comparable<P>> extends Iterable<PQEntry<E,P>>{

	/**
	 * Check whether there are any items in the priority queue
	 * 
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty();	
	
	/**
	 * The number of items in the priority queue
	 * 
	 * @return number of elements in the priority queue
	 */
	public int size(); 			

	/**
	 * Insert a new item in the priority queue
	 * 
	 * @param element data element to insert
	 * @param priority priority of the element

	 * @return an entry object that can be used to modify or remove the entry for this data from the PQ
	 */
	public PQEntry<E, P> insert(E element, P priority);	// Add a new entry and return it

	/**
	 * Retrieve and remove the minimum valued entry from the priority queue
	 * 
	 * @return the entry with a minimum value or null if none
	 */
	public PQEntry<E, P> extractMin();
	
	/**
	 * Retrieve the minimum valued entry from the priority queue
	 * 
	 * @return the entry with a minimum value or null if none
	 */
	public PQEntry<E, P> peekMin();

	/** 
	 * Remove the given entry.
	 *
	 * @param entry the entry to remove
	 * @return true if the entry was removed by this call, false otherwise (i.e., if the entry wasn't in the queue)
	 */
	public boolean remove(PQEntry<E, P> entry);
	
}
