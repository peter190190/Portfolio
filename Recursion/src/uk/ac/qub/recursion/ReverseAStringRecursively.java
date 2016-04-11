package uk.ac.qub.recursion;

/**
 * 
 * @author Peter
 *
 */
public class ReverseAStringRecursively {

	/**
	 * Default constructor
	 */
	public ReverseAStringRecursively() {
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "Peter";
		String reversedRecursively = reverseAStringRecursively(name);
		System.out.println("Reversed Recursively : " + reversedRecursively);

	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	private static String reverseAStringRecursively(String name) {
		
		System.out.println("In with : " + name);
		// Base case to handle one char string and empty string
		if (name.length() < 2) {
			System.out.println("Base Case Reached");
			return name;
		}
		return reverseAStringRecursively(name.substring(1)) + name.charAt(0);
	}

}
