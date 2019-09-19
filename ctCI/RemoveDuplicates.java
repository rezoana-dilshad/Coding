package ctCI;

import java.util.HashSet;

/**
 * 2.1
 * Write code to remove duplicates from an unsorted Linked List
 * 
 * FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
 *
 */
public class RemoveDuplicates {
	//from unsorted, using hashset
	//it takes O(N) time, N is the number of elements in the list
	public static void removeDups(Node head){
		Node previous = null; //to make the new short list
		Node current = head; 
		
		//add everything to a hashset
		HashSet<Integer> hset = new HashSet<>();
		while(current != null)
		{	//if the hashset doesn't contain the current data
			//add teh data to the set
			if(!hset.contains(current.data))
			{
				hset.add(current.data);
				previous = current;
			}
			else
			{	//else move on the next Node data
				previous.next = current.next;			
			}
				current = current.next;	
		}
				
	}
	
	//from unsorted, not using any buffer (using 2 loops)
	// O(1) space but O(N^2) time
		public static void removeDupsNoBuffer(Node head){
			
			Node current = head;
			while(current != null)
			{
				//remove all future nodes that have the same value
				Node runner = current;
				while(runner.next != null)
				{
					if(runner.next.data == current.data)
					{
						runner.next = runner.next.next;
					}
					else
					{
						runner = runner.next;
					}
				}
				current = current.next;
				}
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = new Node(0);
		
		for(int i = 1; i < 7; i++)
		{
			head.addNode(i);
		}
		head.addNode(7);
		head.addNode(4);
		head.addNode(3);
		head.addNode(0);
		head.addNode(3);
		//Now the list is 0, 1, 2, 3, 4, 5, 6, 7, 4, 3, 0, 3
		//After removing, it should be 0, 1, 2, 3, 4, 5, 6, 7
		
		//removeDups(head);
		removeDupsNoBuffer(head);
		Node current = head;
		while(current != null) {
		System.out.print(" " + current.data);
		current = current.next;
		}
	}

}
