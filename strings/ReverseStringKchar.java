package strings;
/**
 * 541.Reverse String II
 * Given a string and an integer k, you need to reverse the first k characters 
 * for every 2k characters counting from the start of the string. If there are 
 * less than k characters left, reverse all of them. If there are less than
 *  2k but greater than or equal to k characters, then reverse the first k 
 *  characters and left the other as original.
 */
public class ReverseStringKchar {
	
	public static String reverseString(String s, int k)
	{
		char[] c1 = s.toCharArray(); //String to char array
		
		int i=0;
		int j=0;
		//for each 2k chars, reverse k chars
		for (int l=0; l<c1.length; l+=2*k)
		{
			i = l;
			j = Math.min(l + k -1, c1.length-1);
			while(i<j)
			{
				char temp = c1[i];
				c1[i] = c1[j];
				c1[j] = temp;
				i++; j--;
			}
		}
		// return c1.toString();
		return new String(c1);
	}
	
	public static void main(String[] args)
	{
		String s = "abcdlmnorstu";
		int k = 2;
		
		String r= reverseString(s, k);
		System.out.println(r.toCharArray());
		
		String s1 = "abcKKKefgKKKijkLLLri";
		int k1 = 3;
		
		String r1= reverseString(s1, k1);
		System.out.println(r1.toCharArray());
	}

}
