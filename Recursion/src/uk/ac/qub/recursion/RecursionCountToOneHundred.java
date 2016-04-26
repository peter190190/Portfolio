package uk.ac.qub.recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionCountToOneHundred {

	private static Scanner scanner = new Scanner(System.in);
	private static int number = 0;
	
	public RecursionCountToOneHundred() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		checkRange();
		System.out.println("You entered : " + number);
		countUp(number);

	}

	public static void countUp(int num) {
		
		if(num == 101) {
			// Base case
			System.out.println();
		} else {
			System.out.println(num);
			countUp(num + 1);
		}
	}
	
	public static void checkRange() {
		
		System.out.println("Please enter a number between 1-10 inclusive");
		
		try {
			number = scanner.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("INVALID .");
			ex.printStackTrace();
			scanner.next();
			System.out.println();
		}
		
		// Check base case - i.e number is between 1-10
		if(number > 0 && number < 11) {
		// Base case
			System.out.println("Number OK");
		} else {
			checkRange();
		}
	}
}
