package ctCI;

import java.util.HashMap;

public class UniqueChar {
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
    
    public static void main(String[] args)
    {
    	String str = "hel";
    	System.out.println(str + " has unique characters: " +  UniqChar(str) );
    	String str2 = "hello";
    	System.out.println(str2 + " has unique characters: " +  UniqChar(str2) );
    	String str1 = "tick";
    	System.out.println(str1 + " has unique characters: " +  UniqChar(str1) );
    	
    	
    }

}
