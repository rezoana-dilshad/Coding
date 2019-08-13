package arithmetic;

/**
 * 
 */

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 * 
 *
 */
public class TwoSum {

	/**
	 *
		Solution using Brute-Force 
	 	2 nested for loops, Running Time = O(n^2) 
	 * 
	 */
	public int[] twoSum(int[] nums, int target)
	{
		//array to store the resultant integers
		int[] result = new int[2];				
		
		//choose one integer at a time from the array 
		for (int i = 0; i < nums.length; i++)
		{
			//An element cannot be used twice, so the second loop will
			//start from the next value of where i currently is, thus i+1
			for (int j = i + 1; j <nums.length; j++)
			{
				if (nums[i] + nums[j] == target)
				{
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		//If no solution found
		 throw new IllegalArgumentException("No two sum solution");
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoSum obj1 = new TwoSum();
		int[] nums = {9, 4, 3, 12};
		int target = 7;
		
		int[] result = new int [2];
		result = obj1.twoSum(nums, target);
		
		System.out.println(result);

	}

}
