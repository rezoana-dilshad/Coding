/**
 * 136. Single Number
 * Given a non-empty array of integers,
 *  every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. 
Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 * 
 */
package arithmetic;
public class SingleNumber {
	public SingleNumber()
	{
		
	}
	public static int singleNumber(int[] nums){
		
		 int single = 0;
		 //use XOR bitwise manipulation to find the single one
		    for (int i = 0; i < nums.length; i++) {
		        single = single^nums[i];
		    }
		    return single;
	}
	
	public static void main(String[] args)
	{
		int[] num = {1, 2, 2, 3, 1};
		System.out.println(singleNumber(num));
		
		int[] num2 = {2, 2, 3, 1, 3};
		System.out.println(singleNumber(num2));
		
		int[] num3 = {4, 1, 2, 1, 2};
		System.out.println(singleNumber(num3));
	}

}
