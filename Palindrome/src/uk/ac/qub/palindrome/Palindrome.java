package uk.ac.qub.palindrome;

import java.util.regex.Pattern;

/**
 * A class that has two methods that can be used to assert if
 * a word is a palindrome. Includes an example of method overloading.
 * @author Peter
 *
 */
public class Palindrome {

	/**
	 * Default constructor
	 */
	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		char[] word = new char[] {'A', 'n', 'n', 'a'};
		String word2 = "Anna"; 
		
		System.out.println(isPalindrome(word));
		System.out.println(isPalindrome(word2));
	}
	
	/**
	 * 
	 * @param word
	 * @return
	 */
	public static boolean isPalindrome(char[] word){
	    
		int i1 = 0;
	    int i2 = word.length - 1;
	    
	    // Change all chars to lowercase
	    for (int i = 0; i < word.length; i++) {
	        word[i] = Character.toLowerCase(word[i]);
	    }
	    
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPalindrome(String str) {
	    
	    if(!Pattern.matches("[A-Za-z]+", str)) {
	    	return false;
	    } else {
	    	return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	    }

	}
}
