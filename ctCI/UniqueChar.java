package ctCI;
/**
 * 1.1 Is Unique
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

import java.util.HashMap;

public class UniqueChar {
	
	//Using additional data structure Hashmap
	//O(n) where n is the number of elements
    public static boolean UniqChar(String s) 
    {
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        for(char c : s.toCharArray())
        {
            hmap.put(c, hmap.getOrDefault(c, 0)+1);
        }
        
        for (char uniq : hmap.keySet())
        {
        	if(hmap.get(uniq) > 1)
        		return false;
        }
        return true;
    }
    
    // Without additional data structure
    //O(n^2)
    public static boolean isUniqueInPlace(String s) 
    {
    	for(int i = 0; i < s.length(); i++)
    	{
    		//check if we already saw this element before
    		for(int j = 0; j < i; j++)
    		{
    			if(s.charAt(i) == s.charAt(j))
    				return false;
    		}
    	}
    	return true;
    }
    
    
    public static void main(String[] args)
    {
    	//Using the first method
    	String str = "hel";
    	System.out.println(str + " has unique characters: " +  UniqChar(str));
    	String str2 = "hello";
    	System.out.println(str2 + " has unique characters: " +  UniqChar(str2));
    	
    	//Using the 2nd method
    	String str1 = "tick";
    	System.out.println(str1 + " has unique characters: " +  isUniqueInPlace(str1));
    	String str3 = "tickt";
    	System.out.println(str3 + " has unique characters: " +  isUniqueInPlace(str3));
    }

}
