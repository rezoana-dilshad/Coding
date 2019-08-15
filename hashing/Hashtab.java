package hashing;

import java.util.HashMap;
import java.util.Hashtable;


public class Hashtab {
	
	public static void main(String[] args)
	{
		//Synchronized implementation of Hashing using HashTable
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("hundred", 100);
		
		//Retrieving a number-
		Integer n = numbers.get("two");
		if(n!= null)
		{
			System.out.println("two is: " + n);
		}
		System.out.println(numbers);
		
		int arr[] = {10, 14, 15, 6, 7, 12, 12, 10, 10, 10, 7, 3, 3};
		createHashMap(arr);
	} 
	
	//creating HashMap from an array
	//Synchronized implementation of Hashing using HashMap
	//by taking elements as keys and frequencies as values.
	static void createHashMap(int arr[])
	{
		//creates an empty hashmap
		HashMap <Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		//Traverse through the given array
		for(int i=0; i<arr.length; i++)
		{
			//checking if the element is present
			Integer c = hmap.get(arr[i]);
			
			//If not yet present, add it to the map
			if(hmap.get(arr[i]) == null)
			{
				hmap.put(arr[i], 1);
			}
			else 
			{
				hmap.put(arr[i], ++c);
			}
		}
		//print the map
		System.out.println(hmap);
	}

}
