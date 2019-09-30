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
		HashMap <Character, Integer> hmap = new HashMap<>();
		int countOdd = 0;
		//str = str.trim();
		for(char c : str.toCharArray())
		{
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}
		for(char c: hmap.keySet())
		{
			if(hmap.get(c) % 2 == 1)
					countOdd++;
					
		}
		
		return countOdd <= 1;
	} 
	
	public static void main(String[] args)
	{
		String str = "tact coa";
		System.out.println(palPerm(str));
	}
}
