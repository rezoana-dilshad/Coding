/**
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 * 
 */
package strings;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs)
	{
		if(strs == null || strs.length == 0)
		{
			return "";
		}
		String lcp = strs[0];
		//iterate and compare the first string with the rest and
		//update the counter when the prefix matches
		for(int i = 0; i < strs.length; i++)
		{
			int count = 0;
			String currString = strs[i];
			while(count < lcp.length() && count < currString.length() && lcp.charAt(count) == currString.charAt(count))
			{
				count++;
			}
			if(count == 0)
			{
				return "no strings";
			}
			lcp = lcp.substring(0, count);
		}
		
		return lcp;
	}

	public static void main(String[] args)
	{
		String[] strs = {"flower", "flow", "flight"};
		String[] strs1 = {"flower", "flow", "light"};
		String[] strs2 = {"fling", "low", "flight"};
		System.out.println(longestCommonPrefix(strs));
		System.out.println(longestCommonPrefix(strs1));
		System.out.println(longestCommonPrefix(strs2));
	}
}
