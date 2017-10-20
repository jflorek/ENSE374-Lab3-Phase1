/**
 * An element of a linked list
 * @author Jonathon
 */
public class ListElement {
	private ListElement next;
	private ListElement previous;
	private int value;
	
	public ListElement()
	{
		setNext(null);
		setPrevious(null);
		setValue(0);
	}

	public ListElement getNext() {
		return next;
	}

	public void setNext(ListElement next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ListElement getPrevious() {
		return previous;
	}

	public void setPrevious(ListElement previous) {
		this.previous = previous;
	}
}