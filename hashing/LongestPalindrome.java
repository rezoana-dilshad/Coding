/*
 * 409. Longest Palindrome
Given a string which consists of lowercase or uppercase letters, 
find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.
Note:
Assume the length of given string will not exceed 1,010.

Example:
Input:
"abccccdd"
Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map;


public class LongestPalindrome {
	
	//using HashMap
	public int longestPalindrome(String str)
	{
HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(char c : str.toCharArray())
		{
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}
  
		int ans = 0;
		for(Map.Entry <Character, Integer> entry: hmap.entrySet())
		{
			int eachCharReps = entry.getValue();
			ans += (eachCharReps / 2) * 2;
			
			if (ans % 2 == 0 && eachCharReps % 2 == 1)
				ans++;	
		}
		return ans;
	}
	
	//using StringArray
	public int longestPalindrome1(String str)
	{
		int[] count = new int[128];
		for(char c: str.toCharArray())
		{
			count[c]++;
		}
		
		int ans = 0;
		for(int eachCharReps : count)
		{
			ans += (eachCharReps / 2) * 2;
		}
		if (ans < str.length())
			ans++;		
		return ans;
	}
	
	public static void main(String[] args)
	{
		String s1 = "abccccdd";		//7 out of 8 chars
		String s2 = "ababa";		//5 out of 5 chars
		String s3 = "abfffb";		//5 out of 6 chars
		
		LongestPalindrome lp = new LongestPalindrome();
		
		int result = lp.longestPalindrome(s1);
		System.out.println(result);
		result = lp.longestPalindrome(s2);
		System.out.println(result);
		result = lp.longestPalindrome(s3);
		System.out.println(result);
		
		result = lp.longestPalindrome1(s1);
		System.out.println("\n Results from different method:\n" + result);
		result = lp.longestPalindrome1(s2);
		System.out.println(result);
		result = lp.longestPalindrome1(s3);
		System.out.println(result);
		
		
		
	}

}
