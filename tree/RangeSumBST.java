/*
 * 938. Range Sum of BST
Easy

361

61

Favorite

Share
Given the root TreeNode of a binary search tree, 
return the sum of values of all TreeNodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23
 

Note:

The number of TreeNodes in the tree is at most 10000.
The final answer is guaranteed to be less than 2^31.
 * 
 * 
 * 
 */

package tree;

import java.util.Stack;

//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	
//	public TreeNode(int val)
//	{
//		this.val = val;
//	}
//}

public class RangeSumBST {
	TreeNode root;
	
	public RangeSumBST()
	{
		root = null;
	}

	//iterative method to find the range sum
	//using Depth First Search
	public int RangeSumBSTiter(TreeNode root, int L, int R)
	{
		int sum = 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		//pushing the root TreeNode to the stack
		stack.push(root);
		while(!stack.isEmpty())
		{
			TreeNode TreeNode = stack.pop();
			
			if(TreeNode != null)
			{
				if(L <= TreeNode.val && TreeNode.val <= R)
					sum = sum + TreeNode.val;
				if(L < TreeNode.val)
					stack.push(TreeNode.left);
				if(TreeNode.val < R)
					stack.push(TreeNode.right);
			}
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		RangeSumBST range = new RangeSumBST();
		TreeNode n1 = new TreeNode(10);
		n1.left = new TreeNode(6);
		n1.right = new TreeNode(15);
		
		n1.left.left = new TreeNode(4);
		n1.left.right = new TreeNode(8);
		
		n1.right.left = new TreeNode(12);
		n1.right.right = new TreeNode(18);
		
		range.root = n1;
		
		System.out.println(range.RangeSumBSTiter(range.root, 4, 15
				));
		
	}
}
