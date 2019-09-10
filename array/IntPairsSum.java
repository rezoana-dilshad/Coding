package array;

import java.util.HashSet;

/**
 * FInd all pairs of int from an integer array whose sum is equal to a given number
 *
 */
public class IntPairsSum {

	//Brute force using 2 loops - O(n^2)
	public static void intPairBruteForce(int[] arr, int sum)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(i != j && (arr[i] + arr[j] == sum))
					System.out.println("{" + arr[i] + "," + arr[j] + "}");
			}
		}
	}
	
	//Using 1 loop and 2 pointers, works well with a sorted array
	// Does not work with -ve numbers
	public static void intPairsPointers(int[] arr, int sum)
	{
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high)
		{
			if(arr[low] + arr[high] == sum) 
			{
				System.out.println("{" + arr[low] + "," + arr[high] + "}");
			}
			if(arr[low] + arr[high] < sum)
				low++;
			else
				high--;
		}
	}
	
	//Using hashSet
	public static void intPairsHashTable(int[] arr, int sum)
	{
		HashSet<Integer> hset = new HashSet<>();
		
		for(int num : arr)
		{
			int target = sum - num;
			//if target number is not in the set then add
			if(!hset.contains(target))
			{
				hset.add(num);
			}
			else
			{
				System.out.printf("{%d, %d} \n", num, target);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 3, 4, 6, 3, 5, 8, 10};
		int[] arr2 = {1, -1, 9, -3, 5, 3, 6, 10, 12};
		int[] arr3 = {1, 2, 4, 5, 8, 9, 10};
		int sum = 9;
		System.out.println("(Brute Force method)The pairs for sum 9 from array 1: ");
		intPairBruteForce(arr, sum);
		System.out.println("(Brute Force method)The pairs for sum 9 from array 2: ");
		intPairBruteForce(arr2, sum);
		
		System.out.println("(Pointer method)The pairs for sum 9 from array 1: ");
		intPairsPointers(arr, sum);
		System.out.println("(Pointer method)The pairs for sum 9 from array 2: ");
		intPairsPointers(arr2, sum);
		System.out.println("(Pointer method)The pairs for sum 9 from array 3: ");
		intPairsPointers(arr3, sum);
		
		System.out.println("(HashSet)The pairs for sum 9 from array 1: ");
		intPairsHashTable(arr, sum);
		
		System.out.println("(HashSet)The pairs for sum 9 from array 2: ");
		intPairsHashTable(arr2, sum);
		
	
		
	}

}
