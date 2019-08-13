/**
 * 268. Missing Number
 * 
 * Given an array containing n distinct numbers
 *  taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity.
 Could you implement it using only constant extra space complexity?
 */
package arithmetic;

public class MissingNumber {
	
	public static int missingNum(int[] nums)
	{
		int n = nums.length;
		int sum = 0;
		int givenSum = 0;
		int result = 0;
	
		/**
		 * //Sum of n n distinct numbers
		sum = (n* (n+1) )/2;
		//Sum of the given numbers
		for(int num : nums)
		{
			givenSum = givenSum + num;
		}
		//finding the missing one
		result = sum - givenSum;
		return result;
		*/
		//Finding the missing number using XOR bit manipulation
		//both method works
		for(int i = 0; i < n; i++)
		{
			givenSum = givenSum ^ nums[i];
		}
		
		for(int i = 1; i <= n; i++)
		{
			sum = sum ^ i;
		}
		
		result = (givenSum ^ sum);
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] nums = {3, 0, 1};
		System.out.println(missingNum(nums));
		
		int[] nums2 = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNum(nums2));
	}
}