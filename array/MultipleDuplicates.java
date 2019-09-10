package array;

import java.util.HashMap;

/*
 * How to find duplicate numbers in an array if it contains multiple duplicates
 */
public class MultipleDuplicates {
	
	public static void multipleDuplicates(int[] arr)
	{
		HashMap <Integer, Integer> hmap = new HashMap<>();
		//put the array into a hashmap
		for(int num : arr)
		{
			hmap.put(num, hmap.getOrDefault(num, 0) + 1);
		}
		
		//check the values of the keys from the keyset if they are > 1
		for(int num : hmap.keySet())
		{	
			if(hmap.get(num) > 1)
			{
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 4, 5, 7, 3, 4, 4, 7, 9, 2, 3, 9, 10};
		
		multipleDuplicates(arr);
	}

}
