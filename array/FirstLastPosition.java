package array;

import java.util.Arrays;

//trying Brute force method (linear O(n) time)
//though the question asked for O(log n) time
public class FirstLastPosition {
	
	public static int[] searchRange(int nums[], int target)
	{
		int[] result = {-1, -1};
		
		for (int i=0; i<nums.length; i++)
		{
			if (nums[i] == target)
			{
				result[0] = i;
				break;
			}
		}
		
		if(result[0] == -1)
		{
			return result;
		}
		
		for (int i=nums.length-1; i>=0; i--)
		{
			if (nums[i] == target)
			{
				result[1] = i;
				break;
			}
		}
		
		return result;
	}

	
	public static void main(String[] args)
	{
		int[] ar = {2, 3, 3, 3, 5, 6, 6, 9};
		
		int target = 6;
		
		System.out.println(Arrays.toString(searchRange(ar, target)));
	}
}
