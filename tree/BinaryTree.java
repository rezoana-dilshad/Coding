package tree;

import java.util.Stack;

class Node
{
	int data;
	Node left, right;
	
	public Node(int d)
	{
		this.data = d;
		left = right = null;
	}
}

public class BinaryTree {
	
	Node root;	//root of the binary tree
	
	public BinaryTree()
	{
		this.root = null;
	}
	//recursive traversals
	//Given a binary tree node, print its nodes according to inorder 
	void printInorder(Node node)
	{
		if(node == null)
			return;
		
		// first recur on the left subtree 
		printInorder(node.left);
		
		//then print the data of the node
		System.out.print(node.data + " ");
		
		//then recur on the right subtree
		printInorder(node.right);
	}
	
	//Given a binary tree node, print its nodes according to preorder
	void printPreorder(Node node)
	{
		if(node != null)
		{
			//first print the data of the node
			System.out.print(node.data + " ");
			
			//then recur on the left subtree
			printPreorder(node.left);
			
			//recur on the right subtree
			printPreorder(node.right);
		}
	}
	
	//Given a binary tree node, print its nodes according to postorder
	void printPostorder(Node node)
	{
		if(node == null)
			return;
		//first traverse the left subtree
		printPostorder(node.left);
		
		//then traverse the right subtree
		printPostorder(node.right);
		
		//then print the data of the node
		System.out.print(node.data + " ");
	}
	
	//inorder traversal using Iterative method (with a Stack)
	void inOrderIter(Node node)
	{
		if(root == null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		Node curNode = root;
		
		while(!s.isEmpty() || curNode != null)
		{
			if(curNode != null)
			{
				s.push(curNode);
				curNode = curNode.left;
			}
			else
			{
				Node n = s.pop();
				System.out.print(n.data + " ");
				curNode = n.right;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		Node start = new Node(1);
		tree.root = start;
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.right = new Node(4);
		tree.root.right.right = new Node(5);
		
		System.out.println("Inorder traversal of the binary tree is: ");
		tree.printInorder(tree.root);
		System.out.println();
		System.out.println("Preorder traversal of the binary tree is: ");
		tree.printPreorder(tree.root);
		System.out.println();
		System.out.println("Postorder traversal of the binary tree is: ");
		tree.printPostorder(tree.root);
		System.out.println();
		System.out.println("The Iterative Inorder traversal of the binary tree is: ");
		tree.inOrderIter(tree.root);
	}
}
