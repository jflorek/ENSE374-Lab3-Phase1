import java.io.PrintStream;

/**
 * A linked list
 * @author Jonathon
 */
public class LinkedList {
	private ListElement head;
	private ListElement tail;
	
	/**
	 * Initializes a new LinkedList instance
	 */
	public LinkedList()
	{
		// add sentinel as head
		head = new ListElement();
		// add sentinel as tail
		tail = new ListElement();
		// connect sentinels
		head.setNext(tail);
		tail.setPrevious(head);
	}
	
	/**
	 * Adds a value to the LinkedList
	 * @param value
	 * value to add to list
	 */
	public void addElement(int value)
	{
		// new element to add to list
		ListElement newElement = new ListElement();
		// assign data to new element
		newElement.setValue(value);
		// get what was once last element in array
		ListElement oldLastElement = tail.getPrevious();
		// set new element's next to tail
		newElement.setNext(tail);
		// set new element's previous to second last element
		newElement.setPrevious(oldLastElement);
		// aim second last at last
		oldLastElement.setNext(newElement);
		// aim tail at new last
		tail.setPrevious(newElement);
	}
	
	/**
	 * Gets a value from the LinkedList
	 * @param index index of the value to retrieve
	 * @return the value at the specified index
	 */
	public int getElement(int index) throws Exception
	{
		// element we are currently at - start at first real element
		ListElement foundElement = head.getNext();
		// traverse list to find element at index
		for (int i = 0; i < index && foundElement != tail; i++)
		{
			foundElement = foundElement.getNext();
		}
		// value of element at position
		int value;
		// if we found element, return it
		if (foundElement != tail)
		{
			value = foundElement.getValue();
		}
		// an element does not exist at the specified location
		else
		{
			throw new Exception();
		}
		return value;
	}
	
	/**
	 * Deletes a value from the LinkedList
	 * @param index index of the value to remove
	 */
	public void deleteElement(int index)
	{
		// element before the one at our current position
		ListElement previous = head;
		// element at current position
		ListElement current = head.getNext();
		// traverse list until we reach index or end
		for (int i = 0; i < index && current != tail; i++)
		{
			previous = current;
			current = current.getNext();
		}
		// if not at end, get element after deleted one (GC will deal with deleted one)
		if (current != tail)
		{
			current = current.getNext();
		}
		previous.setNext(current);
		current.setPrevious(previous);
		
	}
	
	/**
	 * Prints the contents of the LinkedList
	 * @param print PrintStream instance to print to
	 */
	public void printList(PrintStream print)
	{
		// element we are currently at
		ListElement current = head.getNext();
		// traverse linked list
		while (current != tail)
		{
			// print contents
			print.print(current.getValue() + " ");
			current = current.getNext();
		}
		print.println();
	}
	
	/**
	 * Prints the contents of the LinkedList in reverse
	 * @param print PrintStream instance to print to
	 */
	public void printListRvs(PrintStream print)
	{
		// element we are currently at
		ListElement current = tail.getPrevious();
		// traverse linked list
		while (current != head)
		{
			// print contents
			print.print(current.getValue() + " ");
			current = current.getPrevious();
		}
		print.println();
	}
}
