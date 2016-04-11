package uk.ac.qub.recursion;

public class ReverseAStringIteratively {

	public ReverseAStringIteratively() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String name = "Peter";
		String reversedIteratively = reverseAString(name);
		System.out.println("Reversed Iteratively : " + reversedIteratively);
		
	}

	public static String reverseAString(String string) {
	
		StringBuilder stringBuilder = new StringBuilder();
		char[] stringChars = string.toCharArray();
		
		for(int i = stringChars.length - 1; i >= 0; i--) {
			stringBuilder.append(stringChars[i]);
		}
		return stringBuilder.toString();
	}
	
	
}
