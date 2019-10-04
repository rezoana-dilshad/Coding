/**
 * Write a function to get Nth node in a Linked List
Write a GetNth() function an integer index and 
returns the data value stored in the node at that index position.
 */
package ctCI;

class Node{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
	
	public void addNode(int data)
	{
		Node current = this;
		Node n = new Node(data);
		
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = n;
				
	}
	public String toString()
	{
		return data + " ";
	}
	
}
public class LinkedList {
	
	Node head; //first node, head of the list
	
	public LinkedList() 
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public void insertFirst(int d)
	{
		Node newNode = new Node(d); //making a new node using the data
		newNode.next = head; 	//connecting the new node to the head
		head = newNode;			//making head point to the new node
	}
	
	public Node deleteFirst()
	{
		Node temp = head; 		//temporary Node to hold the data of curr head
		head = head.next;		//head is now pointing to the next Node
		return temp;
	}
	
	public void addLast(int data)
	{
		if(head == null)		//when list is empty
			insertFirst(data);
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
	}
	
	public int getNth(int index)
	{
		Node current = head;
		int count = 0;
		
		while(current != null)
		{
			if(count == index)
			{
				return current.data;
			}
			count++;
			current = current.next;
		}
		assert(false); //if function was called for a non-existent element
		return 0;
	}
	
	//adding data at the start of the list
	public void push(int d)	
	{
		Node nd = new Node(d); //create a new node and put data in it
		nd.next = head; //make next of the new node as head;
		head = nd; //Now move the pointer of head to the new node	
	}
	
	public int length()
	{
		Node current = head;
		int count = 0;
		while(current != null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	public int findMid(Node head)
	{
		//one way to find it to find the length
		//and then return the node at the half of the length
		
		//another is using 2 pointer fast n slow
		//fast will traverse 2 nodes at a time
		//slow will traverse 1 node at a time thus will reach in the middle
		//when fast reaches the end
		Node fastP = head;		
		Node slowP = head;
		
		while(fastP.next != null && fastP.next.next != null)
		{
			fastP = fastP.next.next;
			slowP = slowP.next;
		}
		return slowP.data;
	}
	
	public void deleteMid()
	{
		Node fastP = head;
		Node slowP = head;
		Node prev = head;
		
		while(fastP.next != null && fastP.next.next != null)
		{
			fastP = fastP.next.next;
			prev = slowP;
			slowP = slowP.next;
		}
		prev.next = slowP.next;
	}
	
	public void printList(Node head)
	{
		while(head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		//Node head = list.head;
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		list.addLast(8);
		
		System.out.println("The value is " + list.getNth(3));
		System.out.println("The length of the list is: " + list.length());
		System.out.println("The middle of the list is: " + list.findMid(list.head));
		System.out.println("The last value is " + list.getNth(7));
		list.deleteMid();
		list.printList(list.head);
		
	}
}
