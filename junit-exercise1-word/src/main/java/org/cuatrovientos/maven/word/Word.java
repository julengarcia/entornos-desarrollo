/**
 * 
 */
package org.cuatrovientos.maven.word;

/**
 * @author Administrador
 *
 */
public class Word {
	/**
	 * 
	 * @param word
	 * @return
	 */
	public int length (String word) {
		if (null == word) {
			return 0;
		} else {
			return word.length();
		}
	} 
	
	/**
	 * 
	 * @param word
	 * @return
	 */
	public int vowels (String word) {
		int totalVowels = 0;
		String wordToLower = word.toLowerCase();
				
		for (int i = 0; i < word.length();i++) {
			if (wordToLower.charAt(i) == 'a' || 
				wordToLower.charAt(i) == 'e' ||	
				wordToLower.charAt(i) == 'i' ||
				wordToLower.charAt(i) == 'o' ||
				wordToLower.charAt(i) == 'u') {
				totalVowels++;
			}
		}
		
		return totalVowels;
	}
	
	/**
	 * reverses a String
	 * @param word
	 * @return
	 */
	public String reverse (String word) {
		String reversed = "";
		
		for (int i = word.length() -1; i>=0; i--) {
			reversed = reversed + word.charAt(i);
		}
		
		return reversed;
	}
	
	/**
	 * counts  the number of times a char appears in a word
	 * @param word
	 * @param charToCount
	 * @return
	 */
	public int countChar (String word, char charToCount) {
		int totalFound = 0;
		String wordToLower = word.toLowerCase();
				
		for (int i = 0; i < word.length();i++) {
			if (wordToLower.charAt(i) == charToCount) {
				totalFound++;
			}
		}
		
		return totalFound;
	}
	
}
