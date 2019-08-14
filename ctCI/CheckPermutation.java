/**
 * 1.2 Given two strings, write a method to decide if one is a permutation of the
other.
 * A Permutation of a string is another string that contains same characters, 
 * only the order of characters can be different.
 * 
 *comparing and sorting would cost O(n log n)
 *doing it using hashMap - running time O(n)
 * 
 */
package ctCI;

import java.util.HashMap;

public class CheckPermutation {

	public static boolean checkPerm(String s1, String s2)
	{
		HashMap<Character, Integer> hmap = new HashMap<>();
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		
		for(char c : s1.toCharArray())
		{
			hmap.put(c, hmap.getOrDefault(c,0)+1);
		}
		
		for(char d : s2.toCharArray())
		{
			if(!hmap.containsKey(d))
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		//test when s1 > s2
		String str1 = "hellok";
		String str2 = "elhlo";
		
		System.out.print("The strings " + str1 + " and " + str2 + " are permutations of each other: ");
		System.out.println(checkPerm(str1, str2));
		
		//test when s3 < s4
		String str3 = "hello";
		String str4 = "hellokk";
		
		System.out.print("The strings " + str3 + " and " + str4 + " are permutations of each other: ");
		System.out.println(checkPerm(str3, str4));
		
		//test when s5 == s6 but with a Capital letter
		String str5 = "hello";
		String str6 = "Elhlo";
		
		System.out.print("The strings " + str5 + " and " + str6 + " are  permutations of each other: ");
		System.out.println(checkPerm(str5, str6));
		
		//test when s7 and s8 are totally different
		String str7 = "ridita";
		String str8 = "elhlo";
				
		System.out.print("The strings " + str7 + " and " + str8 + " are  permutations of each other: ");
		System.out.println(checkPerm(str7, str8));
				
		//test when s10 and s9 are permutations 
		String str9 = "ridita";
		String str10 = "atirid";
				
		System.out.print("The strings " + str9 + " and " + str10 + " are  permutations of each other: ");
		System.out.println(checkPerm(str9, str10));
	}
}
