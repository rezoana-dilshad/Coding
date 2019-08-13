/**
 * Given an array A of strings made only from lowercase letters, 
 * return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.

 

Example 1:

Input: ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]
 */

package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
	
	public static List<String> commonChars(String[] A)
	{
		List<String> ans = new ArrayList<>();
		int[] count = new int[26];
		
		//initializing each cell with max int value
		Arrays.fill(count, Integer.MAX_VALUE);
		//for each String str in Array A
		for(String str: A)
		{
			int[] newCnt = new int[26];
			for(int i = 0; i < str.length(); i++)
			{
				//count each char's frequency in String str
				++newCnt[str.charAt(i) - 'a'];
			}
			for(int i = 0; i < 26; ++i)
			{
				//update minimum frequency
				count[i] = Math.min(newCnt[i], count[i]);
			}
		}
		for(char c = 'a'; c <= 'z'; ++c)
		{
			while (count[c - 'a']-- > 0)
			{
				ans.add("" + c);
			}
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		String[] str = {"bella", "label", "roller"};
		String[] str2 = {"belllla", "labell", "roalller"};
		System.out.println(commonChars(str));
		System.out.println(commonChars(str2));
		/**
		String[] a = {"name", "lame", "lamest", "fame"};
		
		int[] count = new int[26];
		for(String strs: a)
		{
			int[] newCnt = new int[26];
			for(int i = 0; i < strs.length(); i++)
			{
				//count each char's frequency in String str
				System.out.println(++newCnt[strs.charAt(i) - 'a']);
			}
			count = newCnt;
		}
		for(char c = 'a'; c <= 'z'; ++c)
		{
			while (count[c - 'a']-- > 0)
			{
				System.out.println("" + c);
			}
		}
		*/
		
	}
}
