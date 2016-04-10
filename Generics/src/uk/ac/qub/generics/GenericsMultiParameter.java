package uk.ac.qub.generics;

/**
 * Declaring more than one type parameter using generics
 * @author Peter
 *
 */
public class GenericsMultiParameter {

	public GenericsMultiParameter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Declare and use more than one generic type parameter
	 * @param args
	 */
	public static void main(String[] args) {

		twoTypeParameters("One", 1);
		twoTypeParameters(2, "Two");

	}

	/**
	 * Output key value pairs
	 * @param key
	 * @param value
	 */
	public static <T, S> void twoTypeParameters(T key, S value) {
		
		System.out.printf("Key: %s Value: %s\n", key, value);
	}
}
