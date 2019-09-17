/**
 * 1.2 Given two strings, write a method to decide if one is a permutation
 *  of the other.
 * A Permutation of a string is another string that contains same characters, 
 * only the order of characters can be different.
 * 
 *comparing and sorting would cost O(n log n)
 *doing it using hashMap - running time O(n)
 *  
 */
package ctCI;


import java.util.Arrays;

public class CheckPermutation {

	public static boolean checkPerm(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		//put all the chars in a char array (assuming ASCII chars)
		//go through the string and get count of all the chars in the array
		int[] arr = new int[256];
		for(int i = 0; i < s1.length(); i++)
		{
			char c = s1.charAt(i);
			arr[c]++;
		}
		
		for(int i = 0; i < s2.length(); i++)
		{
			//get the count of each char from the 
			int value = s2.charAt(i);	//char ascii value
			//System.out.println(value);
			if(--arr[value] < 0)
				return false;
		}
		return true;
		
		
		/*//This following ethod does not work if the size of strings s1 & s2 are same
		 * and
		 * s1 has every char type(repeated) s2 does and more
		 * 	 * HashMap<Character, Integer> hmap = new HashMap<>(); if(s1.length() !=
		 * s2.length()) { return false; }
		 * 
		 * 
		 * for(char c : s1.toCharArray()) { hmap.put(c, hmap.getOrDefault(c,0)+1); }
		 * 
		 * for(char d : s2.toCharArray()) { if(!hmap.containsKey(d)) return false; }
		 * 
		 * return true;
		 */
	}
	//USing sorting method
	public static boolean checkPermutation(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	
	public static String sort(String str)
	{
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		//change it to string and return
		//System.out.println(arr.toString()); this does not work
		//System.out.println(new String(arr));
		return new String(arr);
	}
	public static void main(String[] args)
	{
		//test when s1 > s2
		String str1 = "hello";
		String str2 = "elhlo";
		System.out.println(checkPermutation(str1, str2));
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
