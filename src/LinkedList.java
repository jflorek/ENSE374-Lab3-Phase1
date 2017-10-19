import java.io.PrintStream;

/**
 * A linked list
 * @author Jonathon
 */
public class LinkedList {
	private ListElement head;
	
	/**
	 * Initializes a new LinkedList instance
	 */
	public LinkedList()
	{
		// add sentinel as head
		head = new ListElement();
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
		// last element of list
		ListElement lastElement = head;
		// traverse list to find last element
		while (lastElement.getNext() != null)
		{
			lastElement = lastElement.getNext();
		}
		// append value to list
		lastElement.setNext(newElement);
	}
	
	/**
	 * Gets a value from the LinkedList
	 * @param index index of the value to retrieve
	 * @return the value at the specified index
	 */
	public int getElement(int index)
	{
		// element we are currently at - start at first real element
		ListElement foundElement = head.getNext();
		// traverse list to find element at index
		for (int i = 0; i < index && foundElement != null; i++)
		{
			foundElement = foundElement.getNext();
		}
		// value of element at position
		int value;
		// if we found element, return it
		if (foundElement != null)
		{
			value = foundElement.getValue();
		}
		// an element does not exist at the specified location
		else
		{
			value = 0;
		}
		return value;
	}
	
	/**
	 * Deletes a value from the LinkedList
	 * @param index index of the value to remove
	 */
	public void deleteElement(int index)
	{
		
	}
	
	/**
	 * Prints the contents of the LinkedList
	 * @param print PrintStream instance to print to
	 */
	public void printList(PrintStream print)
	{
		
	}
}
