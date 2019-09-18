
/**
* 
* 1.6
* String Compression: Implement a method to perform basic string 
 * compression using the counts
of repeated characters. For example, 
the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, 
your method should return
the original string. You can assume the string has
 only uppercase and lowercase letters (a - z).
 * 
 *
 */
package ctCI;
public class StringCompression {

	public static String compress(String str)
	{				
		StringBuilder compressedStr = new StringBuilder(); //new compressed string
		char[] arr = str.toCharArray();	//char array
		char currentChar = arr[0];	
		int count = 0; //number of occurrences for each char
		
		for(char c : arr)
		{
			if(currentChar == c) {
				count++;
			}
			else
			{
				compressedStr = compressedStr.append(currentChar + String.valueOf(count));
				currentChar = c;
				count = 1;
			}
		}
		
		compressedStr = compressedStr.append(currentChar + String.valueOf(count));		
		//if 
		if(compressedStr.length() >= str.length())
			return str;
		else
			return compressedStr.toString();
		
		
	}
	
	public static void main(String[] args)
	{
		String str = "aabbbcccc";
		String str2 = "aab";
		
		System.out.println(compress(str));
		System.out.println(compress(str2));
	}
}
