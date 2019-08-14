package strings;

public class ToLowerCase {
	
	public static String toLowerCase1(String str)
	{
		String newStr = "";
		// Read an input string and return it in lowercase
		
		for (int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i); //taking each character one by one
			
			if (c>64 && c<91) //if c is uppercase
			{
				c = (char) (c + 32); //convert to lowercase and parse into char
			}
			newStr = newStr + c;
		}
		return newStr;
	}
	
	public static void main (String[] args)
	{
		String str1 = "My name is Ridita";
		String brb = "I LOVE it";
		
		System.out.println(toLowerCase1(str1));
		System.out.println(toLowerCase1(brb));
	}
}
