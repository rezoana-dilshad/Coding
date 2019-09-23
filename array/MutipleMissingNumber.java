package array;

import java.util.HashSet;

/**
 * How to find multiple missing numbers in a given integer 
 * array with duplicates
 * 1. Problem Statement
You have given an integer array of size N. 
Array contains numbers from 1 to N-1 but a couple
 of numbers are missing in an array which also contains duplicates.

Write a Java program to print the missing number from the sequence.

For example, if given array is {1, 1, 2, 3, 5, 5, 7, 9, 9, 9}
 then it has length 10 and contains a number from 1 to 9.
  In this case, missing numbers are 4, 6, and 8.

Read more: https://javarevisited.blogspot.com/2018/04/how-to-find-k-missing-numbers-in-array-java.html#ixzz5zntJJUOx
 * @author Ridita
 *
 */

public class MutipleMissingNumber {
	
	public static void multipleMissingNumber(int[] arr, int n)
	{
		//N will be 1 to N-1
		HashSet<Integer> hset = new HashSet<>();
		
		for(int nums :  arr)
		{
			hset.add(nums);
		}

		//Object[] ar = hset.toArray();
		//Traverse from 1 to N-1 and check if the numbers exist in the set
		for(int i = 1; i < n; i++)
		{
			if(!hset.contains(i))
				System.out.print( i + " ");
		}
	}
	public static void multipleMissingNumberInPlace(int[] arr, int n)
	{
	int[] register = new int[arr.length]; 
	
	// now we iterate over given array to 
	//check which numbers are present
	//and put 1 for their index in the register array
	for (int i : arr) 
	{ 
		register[i] = 1; 	
	} 
	
	// print which numbers are not present
	System.out.println("missing numbers are: "); 
	for (int i = 1; i < register.length; i++) 
	{ 
		if (register[i] == 0) 
		{ 
			System.out.println(i); 
		}
	} 
	
	}	
	public static void main(String[] args)
	{
		//10 integers, from 1 to 9. Missing numbers are 4, 7, 8
		int[] arr = {1, 2, 3, 3, 5, 6, 6, 9, 9, 1};
		int n = 10;
		multipleMissingNumberInPlace(arr, n);
		//multipleMissingNumber(arr, n);
	}

}
