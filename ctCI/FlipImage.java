/**
 * 1.7 Rotate Matrix: Given an image represented by an NxN matrix, 
 * where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. 
Can you do this in place?
 */

package ctCI;

public class FlipImage {

	public static int[][] flipImage(int[][] A)
	{
		for(int i = 0; i < A.length; i++)
		{
			int left = 0;
			int right = A[i].length - 1;
			int temp =0;
			
			while(left <= right)
			{
				temp = A[i][left];
				A[i][left] = A[i][right];
				A[i][right] = temp;
				left++;
				right--;
			}
		}
		return A;
	}
	
	public static void main(String[] args)
	{
		int[][] A = {{1, 2, 3}, {4, 5, 6}, {10, 11, 12}};
		int[][] result = flipImage(A);
		for(int i = 0; i < result.length; i++)
		{
			for(int j = 0; j < result[i].length; j++)
			{
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
