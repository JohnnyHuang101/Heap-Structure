package heaps;
	
/**
 * An "entry" that contains both a data element and a corresponding priority.
 *
 * @param <E> They type of the element (data) for this entry
 * @param <P> The type of the priority for this entry
 * 
 * DONE: DO NOT CHANGE THIS FILE
 */
public interface PQEntry<E, P extends Comparable<P>> {
	
	/**
	 * Get the element
	 * 
	 * @return the data element for this entry
	 */
	E getElement();  					

	/**
	 * Get the priority

	 * @return the priority for this entry
	 */
	P getPriority(); 					
	
	/**
	 * Update the priority for this entry
	 * 
	 * @param newPriority the new priority
	 */
	void updatePriority(P newPriority); 
	
}
