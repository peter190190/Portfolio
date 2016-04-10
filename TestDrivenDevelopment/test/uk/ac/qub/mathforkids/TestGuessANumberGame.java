package uk.ac.qub.mathforkids;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestGuessANumberGame {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * 
	 */
	@Test
	public void testRoundToTenDown() {
		int testNumber = 101;
		GuessANumberGame guessGame = new GuessANumberGame();
		int actual = guessGame.roundToTen(testNumber);
		int expected = 100;
		
		assertEquals(expected, actual);
	}
	
	/**
	 * 
	 */
	@Test
	public void testRoundToTenUp() {
		int testNumber = 99;
		GuessANumberGame guessGame = new GuessANumberGame();
		int actual = guessGame.roundToTen(testNumber);
		int expected = 100;
		
		assertEquals(expected, actual);
	}
	
	/**
	 * 
	 */
	@Test
	public void testRoundToHundredDown() {
		int testNumber = 110;
		GuessANumberGame guessGame = new GuessANumberGame();
		int actual = guessGame.roundToHundred(testNumber);
		int expected = 100;
		
		assertEquals(expected, actual);
	}
	
	/**
	 * 
	 */
	@Test
	public void testRoundToHundredUp() {
		int testNumber = 90;
		GuessANumberGame guessGame = new GuessANumberGame();
		int actual = guessGame.roundToHundred(testNumber);
		int expected = 100;
		
		assertEquals(expected, actual);
	}
}
