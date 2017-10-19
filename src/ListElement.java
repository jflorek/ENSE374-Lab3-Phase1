/**
 * An element of a linked list
 * @author Jonathon
 */
public class ListElement {
	private ListElement next;
	private int value;
	
	public ListElement()
	{
		setNext(null);
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
}