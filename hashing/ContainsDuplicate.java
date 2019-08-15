/**
 * 217. Contains Duplicate
 * Given an array of integers, 
 * find if the array contains any duplicates.

Your function should return true if any
 value appears at least twice in the array, 
 and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
package hashing;
import java.util.HashMap;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums)
	{
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int i =0; i < nums.length; i++)
		{	
			hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
		}
		for(int i = 0; i < nums.length; i++)
		{
			if(hmap.get(nums[i]) > 1) 
			{
				return true;
			}
		}
		return false;
	}
	//By using Brute force method, using 2 loops O(n^2)
	/**
	 * 
	 * public boolean containsDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
        for (int j = 0; j < i; ++j) {
            if (nums[j] == nums[i]) return true;  
        }
    }
    return false;
}
	 */
	//By Using HashSet
	/**
	 * public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
	 * 
	 */
	public static void main(String[] args)
	{
		int[] num = {1, 2, 3, 4, 5, 1};
		System.out.println(containsDuplicate(num));
		
		int[] num1 = {3, 4, 5, 1};
		System.out.println(containsDuplicate(num1));
		
		int[] num2 = {-3, 0, 5, 1};
		System.out.println(containsDuplicate(num2));
		
		int[] num3 = {3, 3, 4, 4, 5, 1};
		System.out.println(containsDuplicate(num3));
	}
}
