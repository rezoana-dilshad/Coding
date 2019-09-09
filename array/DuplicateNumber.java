package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * How to find the duplicate number on a given integer array?
 * 287. Find the Duplicate Number
Medium
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Example 1:

Input: [1,3,4,2,2]
Output: 2
Example 2:

Input: [3,1,3,4,2]
Output: 3
Note:

You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
 *
 */
public class DuplicateNumber {
	
	public static int duplicateNumberSet (int[] arr) {
	//using hashset
	Set<Integer> hset = new HashSet<>();
	int duplicate = 0;
	
	for(int num : arr)
	{
		if(hset.add(num) == false)
		{
			duplicate = num;
		}
	}
	return duplicate;	
	}
	
	//using hashTable
	public static int duplicateNumberHash (int[] arr) {
		int duplicate = 0;
		HashMap <Integer, Integer> hmap = new HashMap<>();
		//put everything in a hashmap
		for(int num : arr)
		{
			hmap.put(num, hmap.getOrDefault(num, 0) + 1);
		}
		//check if the count of any int is more than 1
		for(int count : hmap.keySet())
		{
			if (hmap.get(count) > 1) {
				duplicate = count;	
			}
		}
		return duplicate;
	}
		
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5, 5, 6};
		System.out.println("The duplicate number is (using Set): " + duplicateNumberSet(arr));
		
		System.out.println("The duplicate number is (using Hashmap): " + duplicateNumberHash(arr));
	}
	

}
