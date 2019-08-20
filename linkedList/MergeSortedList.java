

package linkedList;



// Linked List node
//class Node 
//{
//	int data;
//	Node next;
//	Node (int d)
//	{
//		data = d;
//		next = null;
//	}
//	
//}
class SortedList
	{
		Node head;
		
		//method to add a node at the end of the linked list
		public void addToTheLast(Node node)
		{
			if (head == null)
			{
				head = node;
			}
			else
			{
				Node temp = head;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = node;
			}
		}
		
		// Method to print linked List
		void printList()
		{
			Node temp = head;
			while (temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		//Main process
		public static void main(String[] args)
		{
			//Creating 2 lists
			SortedList list1 = new SortedList();
			SortedList list2 = new SortedList();
			
			
			//Node head1 = new Node (5);
			list1.addToTheLast(new Node(5));
			list1.addToTheLast(new Node(10));
			list1.addToTheLast(new Node(15));
			
			//Node head2 = new Node(2);
			list2.addToTheLast(new Node(2));
			list2.addToTheLast(new Node(3));
			list2.addToTheLast(new Node(20));
			
			list1.head = new MergeSortedList().MergeThem(list1.head, list2.head);
			list1.printList();
		}
	}
	
class MergeSortedList
{
	//Take two sorted lists(in increasing order, and slice their nodes together
	//to make one big sorted list
	Node MergeThem(Node headA, Node headB)
	{
		//dummy node to put the result in
		Node dummyNode = new Node(0);
		
		//last node
		Node tail = dummyNode;
		
		while(true)
		{
			//If one list runs out, insert the other list
			if(headA == null)
			{
				tail.next = headB;
				break;
			}
			if(headB == null)
			{
				tail.next = headA;
				break;
			}
			
			// compare the data and append it to the tail
			if(headA.data <= headB.data)
			{
				tail.next = headA;
				headA = headA.next;
			}
			else
			{
				tail.next = headB;
				headB = headB.next;
			}
			
			// Advance the tail
			tail = tail.next;
		}
		return dummyNode.next;
	}

}