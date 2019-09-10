package array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * How to remove duplicates from a given array in Java?
 * @author Ridita
 *
 */
public class RemoveDuplicates {
	//Using a hashset
	public static void removeDuplicates(int[] arr)
	{
		HashSet<Integer> hset = new HashSet<>();
		
		for(int num: arr)
		{
			hset.add(num);
		}
		Object[] array = hset.toArray();
		System.out.println(Arrays.toString(array));
	}
	
	//in place, not using any other space, and return new length of array
	//will only work if the array is Sorted
	public static int removeDuplicatesInPlace(int[] arr)
	{
		if(arr.length == 0)
			return 0;
		int i = 0;
		for(int j = 1; j < arr.length; j++)
		{
			if(arr[j] != arr[i])
			{
				i++;
				arr[i] = arr[j];
			}
		}
		
		//System.out.println(Arrays.toString(arr));
		return i+1;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 3, 5, 6, 6, 7, 1};
		removeDuplicates(arr);
		
		int[] arr2 = {1, 1, 2, 3, 3, 5, 6, 6, 7};
		System.out.println(removeDuplicatesInPlace(arr2));
	}

}
