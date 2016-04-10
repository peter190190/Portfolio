package uk.ac.qub.generics;

public class GenericsMethodOverloading {

	public GenericsMethodOverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Create integer/char arrays
		Integer[] integerArray = { 2, 3, 4, 5, 6, 7 };
		Character[] charArray = { 'a', 'b', 'c', 'd' };
		
		// Display arrays
		printMe(integerArray);
		printMe(charArray);
		
	}
	
	/**
	 * Generic method that accepts a parameter of type T
	 * @param genericArray of T
	 */
	public static <T> void printMe(T[] genericArray) {
		
		for (T anyType : genericArray) {
			System.out.printf("%s", anyType);
		}
	}

}
