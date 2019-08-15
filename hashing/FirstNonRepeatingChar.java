/**
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character in
 *  it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 */

package hashing;

import java.util.HashMap;

public class FirstNonRepeatingChar {

	static int getCharCountArray(String str)
	{
		
		 HashMap<Character, Integer> hmap = new HashMap<>();
		 
		
		//build the HashMap with the chars of the string
		//and how often each char appears
		for(char c : str.toCharArray())
		{
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}
		
		//find the index from the string, by using the HashMap for frequency
		for(int i=0; i<str.length(); i++)
		{
			if(hmap.get(str.charAt(i)) == 1)
			{
				return i;
			}
		}
		
		return -1;
		
	    /**
		//Using an int array to count the frequency of occurrences 
		/int[] count = new int[26];
        int n = str.length(); 
        // build char count bucket : <charIndex, count>
        for (int i = 0; i < n; i++) {            
            int index = str.charAt(i) - 'a';
            count[index]++;
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            int index = str.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }
                
        }
        return -1;
        */
    }

	
	
	public static void main(String[] args)
	{
		String str = "hel";
    	System.out.println(str + " has first unique char at index: " +  getCharCountArray(str));
    	
    	String str1 = "hheel";
    	System.out.println(str1 + " has first unique char at index: " +  getCharCountArray(str1));
    	
    	String str2 = "hhelicopter";
    	System.out.println(str2 + " has first unique char at index: " +  getCharCountArray(str2));
	}
	
}
