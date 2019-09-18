/**
 * URLify: Write a method to replace all spaces in a string with '%20'. 
 * You may assume that the string
has sufficient space at the end to hold the additional characters, 
and that you are given the "true"
length of the string. (Note: If implementing in Java, 
please use a character array so that you can
perform this operation in place.)

EXAMPLE
Input: "Mr John Smith ", 13
Output: "Mr%20John%20Smith"
 */
package ctCI;

public class URLify {

	public static void urlify(char[] str, int truelength)
	{
		//first count the spaces to find the total number of spaces required
		//so that we can start from the last index 
		int spaces = 0;
		for (int i = 0; i < truelength; i++)
		{
			if(str[i] == ' ')
				spaces++;
		}
		
		//index is the total number of spaces required
		//spaces is * by 2 because for each space given in truelength, 
		//we need 2 more spaces to insert %20 
		int totalIndices = truelength + (spaces*2);
		
		for(int i = truelength - 1; i >= 0 ; i--)
		{
			if(str[i] != ' ')
			{
				str[totalIndices-1] = str[i];
				totalIndices--;
			}
			else
			{
				str[totalIndices - 1] = '0';
				str[totalIndices - 2] = '2';
				str[totalIndices - 3] = '%';
				totalIndices = totalIndices - 3;
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args)
	{
		String str1 = "Mr John Smith    ";
		char[] c = str1.toCharArray();
		int tl = 13;
		urlify(c, tl);
		
	}
}
