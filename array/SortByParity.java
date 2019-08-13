package array;

import java.util.Arrays;

public class SortByParity {
	
	public static int[] sortArrayByParity (int[] A)
	{
		int[] evenArray = new int[A.length]; //create a new array
		int count1 = 0, count2 =  A.length - 1; //counters from left and right
		
		for (int i=0; i < A.length; i++) 
		{
			if (A[i] % 2 == 0)	//even numbers on the left
			{
				evenArray[count1] = A[i];
				count1++;
			}
			else
			{
				evenArray[count2] = A[i];	//odd numbers on the right
				count2--;
			}
		}
		return evenArray;	
	}

	public static void main(String[] args)
	{
		int[] A = {3, 1, 2, 4, 6, 9, 10};	
		System.out.print(Arrays.toString(sortArrayByParity(A)));
	}
}
