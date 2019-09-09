package array;
/**
 * FInd the smallest and largest element of an unsorted array
 * @author Ridita
 *
 */

public class SmallestLargest {
	
	public static void smallestLargest(int[] arr)
	{
		int smallest = arr[0];
		int largest = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < smallest)
				smallest = arr[i];
			if(arr[i] > largest)
				largest = arr[i];
		}
		System.out.println("The smallest number is: " + smallest);
		System.out.println("The largest number is: " + largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 17, 100, 436, 760, 367, 1278};
		
		smallestLargest(arr);
	}

}
