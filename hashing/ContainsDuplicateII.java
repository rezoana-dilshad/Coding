/**
 * 219. Contains Duplicate II
 * 
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the 
 * array such that nums[i] = nums[j] and the absolute difference 
 * between i and j is at most k.
Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

package hashing;

import java.util.HashMap;

public class ContainsDuplicateII {
	
	public static boolean containsDuplicate(int[] nums, int k) {
		
		//Using HashMap
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for(int i = 0; i <nums.length; i++)
		{
			if(hmap.containsKey(nums[i]))
			{
				if(i - hmap.get(nums[i]) <= k) //does not work with ==, why?
				{
					return true;
				}
			}
			hmap.put(nums[i], i);
		}
		return false;
		
		//Using brute force, 2 for loops
		/**
		 * for(int i=0; i<nums.length; i++)
		 
		{
			for(int j = 1; j < nums.length; j++)
			{
				if(nums[i] == nums[j] && (Math.abs(j-i)==k))//abs subtraction part
					//fails for the 3rd test [99,99]
				{
					return true;
				}
			}
		}
		return false;
		*/
	}

	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3, 1};
		int k = 3;
		System.out.println(containsDuplicate(nums, k));
		int[] nums1 = {1,0,1,1};
		k = 1;
		System.out.println(containsDuplicate(nums1, k));
		int[] nums2 = {1,2,3,1,2,3}; 
		k = 2;
		System.out.println(containsDuplicate(nums2, k));
		int[] nums3 = {99,99};
		k = 2;
		System.out.println(containsDuplicate(nums3, k));
	}
}
