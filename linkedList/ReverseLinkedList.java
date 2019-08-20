/**
 * 206. Reverse Linked List
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be 
reversed either iteratively or recursively. Could you implement both?
 * 
 */
package linkedList;

//Node definition is present in this package

public class ReverseLinkedList {
	Node head;
		
	//Doing iteratively using multiple pointers
	public Node reverseListIter(Node head)
	{
		Node curr = head;
		Node prev = null;
		
		while(curr != null)
		{
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	//Doing it recursively 
	/*
	 * public Node reverseListRecur(Node head)
	 
	{
		if(head == null || head.next == null)
			return head;
		Node n = reverseListRecur(head.next);
		
		
		Node curr = reverseListRecur(head.next);
		
	}*/
	
	void printList(Node node)
	{
		while(node != null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args)
	{
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		
		System.out.print("List before reversing: ");
		list.printList(list.head);
		
		list.head = list.reverseListIter(list.head);
		
		System.out.print("\n List after reversing: ");
		list.printList(list.head);
	}

}
