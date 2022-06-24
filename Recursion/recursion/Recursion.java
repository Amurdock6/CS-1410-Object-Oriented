package recursion;

/**
 * Program evaluates an equal amount
 * of tests for each method in order 
 * to determine their accuracy,
 * and performance with JUnit.
 * 
 * @author Alex Murdock
 */
public class Recursion {
	
	/**
	 * Adds all numbers in the string there's no numbers left.
	 * 
	 * @param str of type String.
	 * @return <code>sum</code> 
	 * of type integer.
	 */
	public static int sumOfDigits(String str) {
		
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) sum += 
					Integer.parseInt(str.substring(i, i+1)); 
		}
		
		return sum;
	}
	
	/**
	 * Determines the number of smiles 
	 * <code>:)</code> in an array of different 
	 * types of characters and symbols.
	 * 
	 * @param letters of type char within array.
	 * @param index of type integer.
	 * @return <code>smileCounter</code> 
	 * of type integer as number of smiles.
	 * 
	 */
	public static int countSmiles(char[] letters, int index) {
		
		int smileCounter = 0;

		if (index + 2 > letters.length) {
		    return 0;
		}
		    else if(letters[index] == ':') {
		    	
		        if(letters[index+1] == ')') {
		            smileCounter++;
		        }
		    }
		
	    index++;
	    smileCounter = countSmiles(letters, index);

	    return smileCounter;
	}

	/**
	 * Returns a string with all the
	 * characters in UpperCase
	 * and with a space in between.
	 * 
	 * @param str of type String.
	 * @return <code>String</code>
	 * with spaces between characters
	 * and values in UpperCase.
	 */
	public static String toUpper(String str) {
		return str.replace("", " ").toUpperCase().trim();
	}

}
