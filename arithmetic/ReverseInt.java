package arithmetic;
/**
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
*/

public class ReverseInt {

	public static int reverse(int x){
		// If input is negative
		
		int reverseNum = 0;
		int prev_reverseNum = 0;
		
		//Loop for reversing x
		while (x != 0)
		{
			int currDigit = x % 10;
			
			//the last number in x is now the first number
			reverseNum = (reverseNum * 10) + currDigit;
			
			//checking for overflow
			
			if ((reverseNum - currDigit)/10 != prev_reverseNum)
			 
			{
				System.out.println("Warning: Overflow!");
				return 0;
			}
			
			prev_reverseNum = reverseNum;
			x = x / 10;
		}
		
		
		if(x < 0)
		{
			return -reverseNum;
		}
		else return reverseNum;
	}
	
	
	//Testing reverseInt
	public static void main (String[] args)
	{
		int num = 123445;
		System.out.println("Reverse of " + num + " is: " + reverse(num));
		
		num = 1000023445;
		System.out.println("Reverse of " + num + " is: " + reverse(num));
		
		int num2 = -123445;
		System.out.println("Reverse of " + num2 + " is: " + reverse(num2));
	}
}
