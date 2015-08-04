package uk.ac.qub.fizzbuzz;

/**
 * 
 * @author Peter
 * Classic FizzBuzz test with a separate print function
 */
public class FizzBuzz {
	
	// private instance variables
	private static final int LOWER_LIMIT = 15;
	private static final int UPPER_LIMIT = 30;
	
	/**
	 * Adhoc test for print functionality
	 * @param args
	 */
	public static void main(String[] args) {
		
		print();
	}
	
	/**
	 * Method which uses the modulus operator to check for numbers 
	 * divisible by 5, 7 or both (with no remainder)
	 * 
	 * @param number = integer to be tested
	 * 
	 * @return the number if not divisible by 5 or 7 else:
	 * 'Fizz' = Multiple of 5
	 * 'Buzz' = Multiple of 7
	 * 'FizzBuzz' = Multiple of both
	 */
	public static String calculateIfFizzBuzz(int number) {
		
		// Multiple of 5 and 7
		if (number % 5 == 0 && number % 7 == 0) {
			return "FizzBuzz";
		// Multiple of 7
		} else if (number % 7 == 0) {
			return "Buzz";
		// Multiple of 5
		} else if (number % 5 == 0) {
			return "Fizz";
		// Multiple of neither 5 or 7
		} else {
			return "" + number;
		}
				
	}
	
	/**
	 * Using a for loop print the results from 'calculateIfFizzBuzz'
	 * method where a number range is established at method call.
	 * 
	 * @param lower = integer value for lower loop limit
	 * @param upper = integer value for upper loop limit
	 */
	public static void print() {
		
		for (int loop = LOWER_LIMIT; loop <= UPPER_LIMIT; loop++) {
			try {
				System.out.println(calculateIfFizzBuzz(loop));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
