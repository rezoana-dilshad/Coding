/**
 * 961. N-Repeated Element in Size 2N Array
 * In a array A of size 2N, there are N+1 unique elements, 
 * and exactly one of these elements is repeated N times.

Return the element repeated N times.

Example 1:

Input: [1,2,3,3]
Output: 3
Example 2:

Input: [2,1,2,5,3,2]
Output: 2
Example 3:

Input: [5,1,5,2,5,3,5,4]
Output: 5
 */

package hashing;

import java.util.HashMap;

public class NrepeatedElement {
	
	public static int repeatedNTimes(int[] A)
	{
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int i : A)
		{
				hmap.put(i, hmap.getOrDefault(i,0)+1);
		}
		System.out.println(hmap);
		for(int k : hmap.keySet())
		{
			if(hmap.get(k) > 1)
				return k;
		}
		throw null;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2,1,2,5,3,2};
		System.out.println(repeatedNTimes(arr));
		
		int[] arr2 = {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(arr2));
		
	}

}
