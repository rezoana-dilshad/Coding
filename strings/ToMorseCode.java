package strings;

import java.util.HashSet;
import java.util.Set;
/*
 * Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
Note:

The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.
 */

public class ToMorseCode {
	
	//constructor
	public ToMorseCode() 
	{	
	}
	
	//given morse array string
	String[] MORSE = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
	//method for counting the unique morse cases from the hashset
	public int getUniqueMorseRepresentation(String[] words)
	{
		Set<String> uniqueMorse = new HashSet<String>();
		for(String word : words)
		{
			uniqueMorse.add(getMorseCode(word));
		}
		return uniqueMorse.size();
	}
	
	//method for converting EACH word to morse code
	public String getMorseCode(String word)
	{
		StringBuilder mCode = new StringBuilder();
		for (char c : word.toCharArray())
		{
			mCode.append(MORSE[c - 'a']);
		}
		return mCode.toString();
	}
	
	//main method
	public static void main(String[] args)
	{
		ToMorseCode instance1 = new ToMorseCode();
		String[] words1 = {"new", "gin", "zen", "gig", "msg"};
		String[] words2 = { "gin", "zen", "gig", "msg"};
		
		System.out.println(instance1.getUniqueMorseRepresentation(words1));
		System.out.println(instance1.getUniqueMorseRepresentation(words2));
		System.out.println(instance1.uniqueMorseRepresentation(words2));
	}
	
	//
	/***
	//---------------------------------------------------------------
	 * Another way to do it (with nested for loops)-- slower
	 */
	public int uniqueMorseRepresentation(String[] words)
	{
		String[] MORSE = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		Set<String> unique = new HashSet<String>();
		for(String word : words)
		{
			StringBuilder code = new StringBuilder();
			for(char c : word.toCharArray())
			{
				code.append(MORSE[c - 'a']);				
			}
			unique.add(code.toString());
		}
		return unique.size();
	}
	
		
	

}
