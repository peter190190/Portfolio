package uk.ac.qub.palindrome;

// Import resources
import org.junit.*;

import junit.framework.TestCase;

/**
 * JUnit tests for the Palindrome class.
 * Both 'isPalindrome' methods will be tested for palindrome, non palindrome, invalid and case sensitive inputs
 * 
 * @author Peter
 *
 */
public class testPalindrome extends TestCase {

	// Test data
	String testWordIsPalindromeString, testWordIsPalindromeCaseSensitivity, testWordIsNotPalindromeString, testWordInvalid;
	Palindrome palindrome;
	
	/**
	 * Set values for test data
	 */
	@Before
	public void setUp() throws Exception {
		
		testWordIsPalindromeString = "anna";
		testWordIsPalindromeCaseSensitivity = "Anna";
		testWordIsNotPalindromeString = "peter";
		testWordInvalid = "£$%^&";
	}

	
	
	/**
	 * Test isPaldindrome(char[] word) method with a PALINDROME input
	 */
	@Test
	public final void testIsPalindromeChar() {
		
		char[] testWordIsPaldinrome = new char[] {'a', 'n', 'n', 'a'};
		
		System.out.println("About to test testIsPalindromeChar()");
		Boolean expected = true;
		Boolean actual = palindrome.isPalindrome(testWordIsPaldinrome);
		assertEquals(expected, actual);
		System.out.println("Test testIsPalindromeChar() finished\n");
	}
	
	
	/**
	 * Test isPaldindrome(char[] word) method with a PALINDROME input that contains CAPITALISED LETTERS
	 */
	@Test
	public final void testIsPalindromeCharCaseSensitivity() {
		
		char[] testWordIsPalindromeCaseSensitivity = new char[] {'A', 'n', 'n', 'a'};
		
		System.out.println("About to test testIsPalindromeCharCaseSensitivity()");
		Boolean expected = true;
		Boolean actual = palindrome.isPalindrome(testWordIsPalindromeCaseSensitivity);
		assertEquals(expected, actual);
		System.out.println("Test testIsPalindromeCharCaseSensitivity() finished\n");
	}
	
	
	/**
	 * Test isPaldindrome(char[] word) method with a NON PALINDROME input
	 */
	@Test
	public final void testNotPalindromeChar() {
		
		char[] testWordIsNotPalindrome = new char[] {'p', 'e', 't', 'e', 'r'};
		
		System.out.println("About to test testNotPalindromeChar()");
		Boolean expected = false;
		Boolean actual = palindrome.isPalindrome(testWordIsNotPalindrome);
		assertEquals(expected, actual);
		System.out.println("Test testNotPalindromeChar() finished\n");
	}
	
	
	/**
	 * Test isPaldindrome(String word) method with a PALINDROME input
	 */
	@Test
	public final void testIsPalindromeString() {
		
		System.out.println("About to test testIsPalindromeString()");
		Boolean expected = true;
		Boolean actual = palindrome.isPalindrome(testWordIsPalindromeString);
		assertEquals(expected, actual);
		System.out.println("Test testIsPalindromeString() finished\n");
	}
	
	
	/**
	 * Test isPaldindrome(String word) method with a PALINDROME input that contains CAPITALISED LETTERS
	 */
	@Test
	public final void testWordIsPalindromeCaseSensitivity() {
		
		System.out.println("About to test testWordIsPalindromeCaseSensitivity()");
		Boolean expected = true;
		Boolean actual = palindrome.isPalindrome(testWordIsPalindromeCaseSensitivity);
		assertEquals(expected, actual);
		System.out.println("Test testWordIsPalindromeCaseSensitivity() finished\n");
	}
	
	
	/**
	 * Test isPaldindrome(String word) method with a NON PALINDROME input
	 */
	@Test
	public final void testNotPalindromeString() {
		
		System.out.println("About to test testNotPalindromeString()");
		Boolean expected = false;
		Boolean actual = palindrome.isPalindrome(testWordIsNotPalindromeString);
		assertEquals(expected, actual);
		System.out.println("Test testNotPalindromeString() finished\n");
	}
	
	
	/**
	 * Test isPaldindrome(String word) method with an INVALID input
	 */
	@Test  
	public final void testInvalidPalindromeString() {
		
		System.out.println("About to test testInvalidPalindromeString()");
		Boolean expected = false;
		Boolean actual = palindrome.isPalindrome(testWordInvalid);
		assertEquals(expected, actual);
		System.out.println("Test testInvalidPalindromeString() finished\n");
	}
}
