package uk.ac.qub.generics;

public class GenericMethodsCountOccurrences {

	public GenericMethodsCountOccurrences() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Integer[] numbers = { 3, 4, 5, 6, 12, 1, 12, 18 };
		String[] string = { "3", "4", "5", "6", "12", "1", "12", "18" };
		
		System.out.println("Occurrences of 12 (Integer Array): " +countOccurrences(numbers, 12));
		System.out.println("Occurrences of 12 (Integer Array): " +countOccurrences(string, "12"));

	}

	/**
	 * Accepts an array of T and another T argument - 
	 * Counts the occurrence of T in the array.
	 * T is replaced by an actual type (integer and thenString)
	 * at compile time
	 * 
	 * @param list
	 * @param itemToCount
	 * @return
	 */
	public static <T> int countOccurrences(T[] list, T itemToCount) {
		
		int count = 0;
		if (itemToCount == null) {
			for (T listItem : list) {
				if (listItem == null) {
					count++;
				}
				
			}
		} else {
			for (T listItem : list) {
				if (itemToCount.equals(listItem)) {
					count++;
				}
			}
		}
		return count;
	}
	
}
