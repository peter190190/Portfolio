package uk.ac.qub.generics;

/**
 * Using a type parameter as the return type
 * @author Peter
 *
 */
public class GenericReturnTypeNumbersComparison {

	public GenericReturnTypeNumbersComparison() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println(biggestNumber(3, 4));
		System.out.println(biggestNumber(3.9, 4.8));

	}
	
	/**
	 * Compare two objects of the same class by implementing
	 * generic interface Comparable<T>
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static <T extends Comparable<T>> T biggestNumber(T num1, T num2) {
		
		if (num1.compareTo(num2) > 0) {
			return num1;
		} else {
			return num2;
		}
	}

}
