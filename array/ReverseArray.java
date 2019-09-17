package array;
/**
 * How to reverse an array in place?
 */
import java.util.Arrays;

public class ReverseArray {
	
	public static void reverseArray(int[] arr)
	{
			int i = 0;
			int j = arr.length -1;
			while(i < j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(arr));
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
		
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
		
		reverseArray(arr2);
		System.out.println(Arrays.toString(arr2));
		

	}

}
