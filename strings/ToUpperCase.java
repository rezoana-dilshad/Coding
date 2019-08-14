package strings;

public class ToUpperCase {
	
	public static String toUpperCase(String str)
	{
		
		String newStr = ""; //to return the UPPERCASE string
		
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i); //going through each char of the array
			
			if(c>96 && c<123)
			{
				c = (char)(c - 32);
			}
			newStr = newStr + c;
		}
		return newStr;
	}

	public static void main(String[] args)
	{
		String str1 = "My name is Ridita";
		String str2 = "I love it";
		
		System.out.println(toUpperCase(str1));
		System.out.println(toUpperCase(str2));
	}
}

