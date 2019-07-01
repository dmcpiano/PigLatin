
//stuck on consonant condition, will ask for help today

package co.grandcircus.piglatin;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {

	public static void main(String [] args) {
		
		System.out.println("Welcome to the Pig Latin translator! ");
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a word to translate. ");
		String userInput = scnr.next();
		userInput = userInput.toLowerCase();
		translator(userInput);
		
	}
	
	public static void translator (String userInput) {
		
			String[] vowels = {"a" ,"e" ,"i" ,"o" ,"u" };
			String[] consonants = {"b" ,"c" ,"d" ,"f" ,"g" ,"h" ,"j","k" ,"l", "m", "n", 
									"p", "q", "r", "s", "t", "v", "w", "x", "y", "z"}; 
			
			for (int i = 0; i  < userInput.length();i++) {
			
				char character = userInput.charAt(i);
				
				if (character=='a' || character=='e' || character=='i' || character == 'o' || character == 'u') {
				String ans = userInput.substring(i) + userInput.substring( 0, i ) + "way";
				System.out.println(ans);
				return;
				
				
				}		
	
	}
 }
	
}

