package uk.ac.qub.recursion;

/**
 * A simple class that demonstrates how recursion can replace iteration
 * @author Peter
 *
 */
public class CountDown {

	public CountDown() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("Initiating count down...\n");
		countDown(10);

	}

	/**
	 * 
	 * @param num
	 */
	private static void countDown(int num) {

		
		if(num <= 0) {
			System.out.println("End");
		} else {
			System.out.println(num);
			countDown(num - 1);
		}
	}

}
