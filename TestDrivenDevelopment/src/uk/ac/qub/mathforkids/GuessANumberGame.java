package uk.ac.qub.mathforkids;

public class GuessANumberGame {

	public GuessANumberGame() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Round number to nearest 10
	 * Created from test class, TDD
	 * @param testNumber
	 * @return
	 */
	public int roundToTen(int testNumber) {

		int answer = (int)(Math.rint((double) testNumber / 10) * 10);
		return answer;
	}

	/**
	 * Round number to nearest 100
	 * Created from test class, TDD
	 * @param testNumber
	 * @return
	 */
	public int roundToHundred(int testNumber) {

		int answer = (int)(Math.rint((double) testNumber / 100) * 100);
		return answer;
	}

}
