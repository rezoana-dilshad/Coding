/**
 * 1.5 One Away: There are three types of edits that can be
 *  performed on strings: insert a character,
remove a character, or replace a character. 
Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
 */
package ctCI;

import java.util.HashMap;

public class OneAway {

	public static boolean oneAway(String s1, String s2)
	{
		HashMap<Character, Integer> hmap = new HashMap<>();
		int isequal = 0;
		
		if(s1.length() == s2.length() || s1.length() == s2.length()+1 || s1.length()+1 == s2.length()) 
		{
			for(char c: s1.toCharArray())
			{
				hmap.put(c, hmap.getOrDefault(c, 0) + 1);
			}
			for(char c : s2.toCharArray())
			{
				if(!hmap.containsKey(c))
					isequal++;
			}
		}
		else
			return false;
		
		return isequal <=1;
		
		//How about repeated letters? ContainsKey does not work there!
	}
	
	public static void main(String[] args)
	{
		//s1 > s2
		String s1 = "pale";
		String s2 = "ple";
		System.out.println("Zero/ 1 edits away? " +s1 + ", " + s2 + " ->" +oneAway(s1, s2));
		//s3 < s4
		String s3 = "pale";
		String s4 = "pales";
		System.out.println("Zero/ 1 edits away? " +s3 + ", " +  s4 + " ->" +oneAway(s3, s4));
		//equal length, 1 letter diff
		String s5 = "pale";
		String s6 = "ale";
		System.out.println("Zero/ 1 edits away? " +s5 + ", " +  s6 + " ->" +oneAway(s5, s6));
		//2 letters diff
		String s7 = "pale";
		String s8 = "bake";
		System.out.println("Zero/ 1 edits away? " +s7 + ", " +  s8 + " ->" +oneAway(s7, s8));

		String s9 = "pee";
		String s10 = "pa";
		System.out.println("Zero/ 1 edits away? " +s9 + ", " +  s10 + " ->" +oneAway(s9, s10));
		
	}
}
