/**
 *1.4
 * Palindrome Permutation: Given a string, write a function to check 
 * if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. 
A permutation is a rearrangement of letters. 
The palindrome does not need to be limited to just dictionary words.

EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)
 */
package ctCI;

import java.util.HashMap;

public class PalindromePermutations {
	
	//checking if it is a permutation of a palindrome
	
	public static boolean palPerm(String str)
	{
		int countOdd = 0;
		//str = str.trim();
		int[] str1 = new int[26];
		for(char c : str.toCharArray())
		{
			str1[c]++;	
		}
		for(int n : str1)
		{
			if (str1[n] % 2 == 1)
				countOdd++;
		}
		
		return countOdd <= 1;
	} 
	
	public static void main(String[] args)
	{
		String str = "tactcccoa";
		System.out.println(palPerm(str));
	}
}
