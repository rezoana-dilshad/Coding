package array;

import java.util.Arrays;

/**
 * How to sort an integer array in place using QuickSort Algorithm
 * @author Ridita
 *
 */
public class ArrayQuickSort {
	//Using the middle element as the pivot
	public static void arrQuickSort(int[] arr, int start, int end)
	{
		if(arr == null || arr.length == 0)
			return;
		if(start >= end)
			return;
		
		//picking the mid element as the pivot
		int mid = start + (end-start)/2;
		System.out.println("mid is: " + mid);
		int pivot = arr[mid];
		
		//make left<pivot and right>pivot
		int i = start, j = end;
		while(i <= j)
		{
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i <= j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		//recursively sort two sub parts:
		if (start < j)
			arrQuickSort(arr, start, j);
		if(end > i)
			arrQuickSort(arr, i, end);
	}
	
	//Using the last element as the pivot &
	//using separate method for partition
	public static void arrayQuickSort(int[] arr, int start, int end)
	{
		int partition = partition(arr, start, end);
		
		if(partition -1 > start)
		{
			arrayQuickSort(arr, start, partition - 1);
		}
		if(partition + 1 < end)
		{
			arrayQuickSort(arr, partition + 1, end);
		}
		
	}
	
	public static int partition(int[] arr, int start, int end)
	{
		//choosing the rightmost element as the pivot
		int pivot = arr[end];
		 
		for(int i = start; i < end; i++)
		{
			if(arr[i] < pivot)
			{
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
			}
		}
		int temp = arr[start];
		arr[start] = pivot;
		arr[end] = temp;
		
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, -1, 5, 4, 6, 8, 2, 3, 1, 4};
		System.out.println("Array Before Sorting" + Arrays.toString(arr));
		arrQuickSort(arr, 0, arr.length-1);
		System.out.println("Array After Sorting" + Arrays.toString(arr));
		
		

	}

}
