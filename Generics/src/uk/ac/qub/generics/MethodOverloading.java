package uk.ac.qub.generics;

/**
 * Method overloading example without generics
 * @author Peter
 *
 */
public class MethodOverloading {

	public MethodOverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Create integer/char arrays
		Integer[] integerArray = { 2, 3, 4, 5, 6, 7 };
		Character[] charArray = { 'a', 'b', 'c', 'd' };
		
		// Display array contents
		printMe(integerArray);
		printMe(charArray);

	}
	
	/**
	 * Outputs character array contents
	 * @param array
	 */
	private static void printMe(Character[] array) {
		
		for (Character c : array) {
			System.out.printf("%s", c);
		}
	}
	
	/**
	 * Outputs integer array contents
	 * @param array
	 */
	private static void printMe(Integer[] array) {
		
		for (Integer i : array) {
			System.out.printf("%s", i);
		}
	}

}
