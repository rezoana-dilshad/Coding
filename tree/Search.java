package tree;

/*
 * 700. Search in a Binary Search Tree

 * Given the root node of a binary search tree (BST) and a value. 
 * You need to find the node in the BST that the node's value 
 * equals the given value. Return the subtree rooted with that node. 
 * If such node doesn't exist, you should return NULL.

For example, 

Given the tree:
        4
       / \
      2   7
     / \
    1   3

And the value to search: 2
You should return this subtree:

      2     
     / \   
    1   3
In the example above, if we want to search the value 5, since there is no 
node with value 5, we should return NULL.

Note that an empty tree is represented by NULL, 
therefore you would see the expected output (serialized tree format) 
as [], not null.
 */

public class Search {
	//Using Recursion
	public TreeNode searchBSTrecur(TreeNode root, int val)
	{
		if(root == null) return null;
		if(root.val == val) return root;
		if(val < root.val)
			return searchBSTrecur(root.left, val);
		else
			return searchBSTrecur(root.right, val);
	}
	
	//Using Iteration
	public TreeNode searchBSTiter(TreeNode root, int val)
	{
		while(root != null)
		{
			if(root.val == val)
				return root;
			if(val < root.val)
			{
				root= root.left;
			}
			else
			{
				root = root.right;
			}
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		Search search = new Search();
		//MergeTrees t2 = new MergeTrees();
		TreeNode n1 = new TreeNode(10);
		n1.left = new TreeNode(5);
		n1.right = new TreeNode(15);
		
		n1.left.left = new TreeNode(1);
		n1.left.right = new TreeNode(6);
		
		n1.right.left = new TreeNode(12);
		int val = 5;
		TreeNode result = search.searchBSTrecur(n1, val);
		
		while (result != null)
		{
			System.out.println( result.val);
			result = result.left;
			System.out.println( result.val);
		}

		//System.out.println( result.val);
		System.out.println(search.searchBSTiter(n1, val));
		
	}
	
}
