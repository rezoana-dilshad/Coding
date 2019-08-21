/**
 * 832. Flipping an Image
Given a binary matrix A, we want to flip the image horizontally,
 then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image
 is reversed.  For example, flipping [1, 1, 0] horizontally
  results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, 
and each 1 is replaced by 0. For example, inverting [0, 1, 1] 
results in [1, 0, 0].

Example 1:

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Notes:

1 <= A.length = A[0].length <= 20
0 <= A[i][j] <= 1
 */

package matrix;

public class FlipAndInvertImage {
	public static int[][] flipAndInvertImage(int[][] A)
	{
		/**
		//flipping the image is reversing the ints in each row 
		for(int i = 0; i < A.length; i++)
		{
			int left = 0;
			int right = A[i].length-1; //row length
			
			while(left <= right) //reverse the row values
			{
				int temp = A[i][left];
				A[i][left] = A[i][right];
				A[i][right] = temp;
				
				left++;
				right--;
			}
		}
		//inverting the image is changing 0 to 1 and 1 to 0
		for(int i = 0; i < A.length; i++)
			for(int j = 0; j < A[i].length; j++)
			{
				if (A[i][j] == 1)
					A[i][j] = 0;
				else
					A[i][j] = 1;
			}
		*/
		
		//blending both loops and Doing both flip and invert together
		// invert while swapping by checking the value.
		for(int i = 0; i < A.length; i++)
		{
			int left = 0;
			int right = A[i].length-1; //row length
			
			while(left <= right) //reverse the row values
			{
				int temp = A[i][left];
				A[i][left] = A[i][right] == 0? 1 : 0;
				A[i][right] = temp == 0? 1: 0;
				
				left++;
				right--;
			}
		}
		
		return A;	
	}	
		public static void main(String[] args)
		{
			int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
			int[][] result = flipAndInvertImage(A);
			
			   for(int i = 0; i < result.length; i++)
		        {
		            for(int j = 0; j < result[i].length; j++)
		            {
		                System.out.print(result[i][j] + "");
		            }
		            System.out.println();
		        }
			 int[][] B = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
			 result = flipAndInvertImage(B);
			   for(int i = 0; i < result.length; i++)
		        {
		            for(int j = 0; j < result[i].length; j++)
		            {
		                System.out.print(result[i][j] + "");
		            }
		            System.out.println();
		        }
		}
}
