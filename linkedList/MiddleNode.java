package linkedList;

public class MiddleNode {
	
	public static Node middleNode(Node head)
	{
		//put everything into an array and then find the middle node
		Node[] arr = new Node[100];
		int nodes = 0;
		
		while(head.next != null)
		{
			arr[nodes] = head;
			head = head.next;
			nodes++;
		}
		if(nodes % 2 == 0)
			return arr[nodes /2 + 1 ];
		else
			return arr[nodes /2];
	}
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		for(int i=1; i<=5; i++)
		{
			list.push(i);
		}
		Node n = list.head;
		System.out.println(n);
	}

}
