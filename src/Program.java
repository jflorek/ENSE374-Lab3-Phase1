
import java.util.Scanner;

/**
 * The main class for our program
 * @author Jonathon
 *
 */
public class Program {

	/**
	 * Entry method for our program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean stop = false;
		while(!stop)
		{
			System.out.println("Commands (case-insensitive):"
					+ "\nadd [val1, val2, ... valn] : adds values to the list until non-integer entered"
					+ "\nget [index] : gets the value at the specified index, or 0 if no element at index"
					+ "\ndelete [index] : deletes value at specified index if it exists"
					+ "\nprint : prints contents of list from begin to end"
					+ "\nexit : end the program");
			switch(in.next().toLowerCase())
			{
			case "add":
				System.out.println("Adding values:");
				while(in.hasNextInt())
				{
					int nextValue = in.nextInt();
					list.addElement(nextValue);
					System.out.println(nextValue);
				}
				break;
			case "get":
				System.out.println("Gets a value");
				break;
			case "delete":
				System.out.println("Deletes a value");
				break;
			case "print":
				System.out.println("Prints values");
				break;
			case "exit":
				stop = true;
				break;
			default:
				System.out.println("Invalid command");
			}
		}
		System.out.println("Exiting program...");
	}

}
