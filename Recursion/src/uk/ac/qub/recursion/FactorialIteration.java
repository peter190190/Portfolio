package uk.ac.qub.recursion;

/**
 * Simple Class to demonstrate how factorial is calculated via iteration
 * @author Peter
 *
 */
public class FactorialIteration {

	public FactorialIteration() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		FactorialIteration factorialIteration = new FactorialIteration();
		System.out.println("Factorial 5! : " + factorialIteration.factorial(5));
		
	}
	
	public int factorial(int n) {
		
		int result = 1;
		for(int loop = n; loop >= 1; loop--) {
			result *= loop;
		}
		return result;
	}
}
