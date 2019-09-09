package array;

/**
 * How to find the missing number in given integer array of 1 to 100?
 * 
 *  * @author Ridita
 */
public class MissingNumber {
	
	public static int missingNumber(int[] arr, int n)
	{
		//find the sum of n numbers from 1-100
		//this can be done once if the n is fixed
		//else the calculation has to be done every time for a different range of n
		int sum = (n *(n + 1))/2;
		
		int result, arraySum = 0;
		for(int num : arr)
		{
			arraySum += num;
		}
		System.out.println("Sum of n numbers: " + sum + "\nArray length is: " + arr.length + "\nSum of n numbers: " + arraySum);
		result = sum - arraySum;
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] arr = new int[100];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;		//removing number 4
		
		for(int i = 4; i < 99; i++)
		{
			arr[i] = i+2;
		}
		 
		int n = 100;
		System.out.println("the missing number is: " + missingNumber(arr, n));
		
	}
	

}
