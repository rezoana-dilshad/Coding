/**
 * 557. Reverse Words in a String III
 * Given a string, you need to reverse the order of characters in each word
 *  within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated
 by single space and there will not be any extra space in the string.
 */
package strings;

import java.util.ArrayList;

public class ReverseStringWords {
	//first split the words
	public static String[] split(String s)
	{
		ArrayList <String> words = new ArrayList<> ();
		
		StringBuilder word = new StringBuilder();
		for(int i=0; i < s.length(); i++ )
		{
			if(s.charAt(i) == ' ')
			{
				words.add(word.toString());
				word = new StringBuilder();
			}
			else
				word.append(s.charAt(i));
		}
		words.add(word.toString());
		return words.toArray(new String[words.size()]);
	}
	
	
			//second reverse the words
	public static String reverse(String s)
	{
		StringBuilder stb = new StringBuilder(s);
		return stb.reverse().toString();
	}
			//finally add the reversed words to a StringBuilder
	public static String reverseStringWords(String s)
	{
		        String words[] = split(s);
		        
		        StringBuilder stb = new StringBuilder();
		        for (String word: words)
		            stb.append(reverse(word) + " ");
		        return stb.toString().trim();
	}
	
	public static void main(String[] args)
	{
		String s1 = "Hello World";
		String s2 = "hello how are you";
		String s3 = "Let's take LeetCode contest";
		
		System.out.println(reverseStringWords(s1));
		System.out.println(reverseStringWords(s2));
		System.out.println(reverseStringWords(s3));
	}
	
}
