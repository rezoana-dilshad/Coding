package array;
import java.util.Arrays;

public class ArrayPartitionPairSum {
	//finding the sum of the min of the pairs of the array
	
	public ArrayPartitionPairSum()	//constructor
	{
	}
	public int arrayPairSum(int[] nums)
	{
		int sum = 0;
		int[] sortedArray = Sort(nums);
		System.out.println(Arrays.toString(sortedArray));
		
		//if number of items is even
		if (sortedArray.length % 2 == 0)
		{
			for(int i=0; i<sortedArray.length; i = i+2)
			{
				sum = sum + sortedArray[i];
			}
		}
		//if number of items is odd
		else
		{
			for(int i=0; i<sortedArray.length; i = i+2)
			{
				sum = sum + sortedArray[i];
			}
			sum = sum + sortedArray[sortedArray.length -1];
		}
		return sum;
	}
	
	//first we will sort the array using heapsort
	public int[] Sort(int arr[])
	{
		int n = arr.length;
		
		//Build heap (rearrange array)
		for (int i= n/2 -1; i>=0; i--)	
		{
			heapify(arr, n, i);
		}
		
		//Now extract the elements one by one from the heap
		for (int i=n-1; i>=0; i--)
		{	
			//move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			//call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
		
		return arr;
	}
	
	//max-heapify procedure, n is heap size, root= node i which is an index at arr[]
	void heapify(int arr[], int n, int i)
	{
		int largest = i; 	//initializing largest
		int l = 2*i + 1;	// left
		int r = 2*i + 2;	// right
		
		//If left child > root and is <than size
		if(l < n && arr[l] > arr[largest])
			largest = l;
		
		//IF right child> largest so far
		if(r < n && arr[r] > arr[largest])
			largest = r;
		
		//If largest is not the root
		if (largest != i)
		{
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
		}
		
		//Now recursively heapify the affected tree
		//heapify(arr, n-1, largest);
	}
	
	public static void main(String[] args)
	{
		int[] nums = {1, 4, 3, 2};
		int[] nums2 = {4, 5, 3, 9, 6, 8, 5, 2};
		int[] nums3 = {4, 5, 3, 9, 6, 8, 5, 2, 1};
		
		ArrayPartitionPairSum newpair = new ArrayPartitionPairSum();
		
		System.out.println("The sum is " + newpair.arrayPairSum(nums) + "\n");
		System.out.println("The sum is " + newpair.arrayPairSum(nums2) + "\n");
		System.out.println("The sum is " + newpair.arrayPairSum(nums3));
	}
	
}
