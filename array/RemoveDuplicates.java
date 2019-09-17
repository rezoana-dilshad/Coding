package array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * How to remove duplicates from a given array in Java?
 * @author Ridita
 *
 */
public class RemoveDuplicates {
	//O(n) and space O(n)
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
	//O(N)
	public static int removeDuplicatesInPlace(int[] arr)
	{
		int i = 0;
		for(int j = 1; j < arr.length; j++)
		{
			if(arr[j] != arr[i])
			{
				i++;
				arr[i] = arr[j];
			}
		}
	return i+1;
	}
	
	//Sort first, then remove duplicates
	//O(n log n)
	public static void removeDuplicatesInPlaceUnsorted(int[] arr)
	{
		//sort the unsorted array
		//Arrays.sort() uses Tim sort - O(N log N) for array of objects
		//and QuickSort for arrays of primitives - again O(N log N).
		Arrays.sort(arr);
		
		int j = 0;
		for(int i = 0; i < arr.length-1; i++)
		{
			//if the value at i and i+1 are not same
			if(arr[i] != arr[i+1]) 
			{
				arr[j++] = arr[i];
			}
		}
		//the last one
		arr[j++] = arr[arr.length-1];
		
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 3, 5, 6, 6, 7, 1};
		removeDuplicates(arr);
		
		int[] arr2 = {1, 1, 2, 3, 3, 5, 6, 6, 7};
		System.out.println(removeDuplicatesInPlace(arr2));
		removeDuplicatesInPlace(arr2);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {1, 1, 2, 3, 3, 5, 6, 7, 7};
		removeDuplicatesInPlaceUnsorted(arr3);
		System.out.println(Arrays.toString(arr3));
	}

}
