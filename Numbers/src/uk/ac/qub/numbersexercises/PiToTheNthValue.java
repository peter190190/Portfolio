package uk.ac.qub.numbersexercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class PiToTheNthValue {

	public PiToTheNthValue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		//findPiToTheNthDigit();
		findPiToTheNthDigitVersion2();
		
	}

	private static void findPiToTheNthDigitVersion2() {

		BigDecimal seven = new BigDecimal(7.0);
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please input the amount of decimal places of Pi to be displayed:");
		
		while(input.hasNextInt()) {
			
		    
		    int decimalPlaces = input.nextInt();
		    BigDecimal pi = new BigDecimal(22.0).divide(seven, decimalPlaces, BigDecimal.ROUND_UP);

		    if (decimalPlaces > 100 || decimalPlaces < 0) {
		        System.out.println("Invalid entry (Please input 0 - 100 inclusive)");
		    } else {
		        System.out.println("Pi to " +decimalPlaces +" decimal place(s):\n" +pi);
		    }
		}
		
		System.out.println("Invalid entry (Please input INTEGERS between 0-100");
		System.out.println("Restarting...\n");
		findPiToTheNthDigitVersion2();
	     
	}
		
	

	/**
	 * Find Pi to the nth digit with a boundary of 0-15 digits
	 * Has an issue with input of 8 - going to use BigDecimal instead
	 */
	private static void findPiToTheNthDigit() {

		
		Scanner input = new Scanner(System.in);
		System.out.println("----------Print Pi to 'n' decimal places----------");
		System.out.println("Please enter a number ('n') between 0-15 inclusive");
		
		//Loop the function if there is an integer value
		while(input.hasNextInt()) {
				
			
			
			int decimalPlaces = input.nextInt();
			double piDigitsToShow = Math.floor(Math.round((Math.PI % 1) * (Math.pow(10.0, decimalPlaces))));
						
			if (decimalPlaces == 0) {
				System.out.println("Pi to '" +decimalPlaces +"' decimal place(s): ");
				System.out.println(Math.round(Math.PI*10/10) +"\n");
			} else if (decimalPlaces < 0 || decimalPlaces > 15){
				System.out.println("Invalid entry (Please input 0 - 15)");
			} else {
				System.out.println("Pi to '" +decimalPlaces +"' decimal place(s): ");
				System.out.println((3 + (piDigitsToShow / Math.pow(10, decimalPlaces )) ) +"\n");
			}
		}
		
		
		System.out.println("Invalid entry (Please input integers between 0-15");
		System.out.println("Restarting...\n");
		findPiToTheNthDigit();
		
		
		
		
		
	}
}
