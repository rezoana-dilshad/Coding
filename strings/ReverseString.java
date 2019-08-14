package strings;
/*
 * Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 */

public class ReverseString {
	//method 1: using brute force while loop
	public static char[] reverseString(char[] s) {
		
		int j = s.length-1;
		int i = 0;
		while(i < j)
		{	
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++; j--;
		}
		return s;
	}
	
	//method 2: easy hack using StringBuilder method
	public static void reverseString2(char[] s)
	{
		StringBuilder stb = new StringBuilder();
		stb.append(s);
		
		s = stb.reverse().toString().toCharArray();
		
		System.out.println(s);
	}
	
	public static void main(String[] args)
	{	
		//Testing method 1
		String str = "Hello";
		char[] char1 = str.toCharArray();
		System.out.println(reverseString(char1));
		
		String str1 = "Ridita";
		char[] char2 = str1.toCharArray();
		System.out.println  (reverseString(char2));
		
		String str4 = "Hello how are you";
		char[] char3 = str4.toCharArray();
		System.out.println  (reverseString(char3));
		
		
		//testing method 2
		String str3 = "Hello how are you";
		char[] c1 = str3.toCharArray();		
		reverseString2(c1);
		
	}
}
