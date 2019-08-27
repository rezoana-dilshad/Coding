package tree;


//class TreeTreeNode{
//	int val;
//	TreeTreeNode right;
//	TreeTreeNode left;
//	
//	public TreeTreeNode(int val)
//	{
//		this.val = val;
//	}
//	
//}

public class MergeTrees {
	//TreeNode root;
	
	public TreeNode mergeTrees(TreeNode n1, TreeNode n2)
	{
		//if both the TreeNodes are null; return null
		if(n1 == null && n2 == null)
			return null;
		else if(n1 == null)
			return n2;
		else if(n2 == null)
			return n1;
		else 
		{
			TreeNode n = new TreeNode(n1.val + n2.val);
			n.left = mergeTrees(n1.left, n2.left);
			n.right = mergeTrees(n1.right, n2.right);
			return n;
		}
		
		/**
		//declare a stack of array of TreeNodes
		Stack<TreeNode[]> stack = new Stack<>();
		//push the roots of the both trees as an array
		stack.push(new TreeNode[] {n1, n2});
		
		//while the stack is not empty
		while(!stack.isEmpty())
		{
			//the array of TreeNodes that we are currently popping from stack
			TreeNode[] t = stack.pop();
			
			//if the TreeNode of any of the trees is null, continue next
			if(t[0] == null || t[1] == null)
			{
				continue;
			}
			//add the values if 2 TreeNodes exists from both trees
			//at the same position
			t[0].val += t[1].val;
			
			//if the left of 1st tree is absent, use the left child
			//of the 2nd tree
			if(t[0].left == null)
			{
				t[0].left = t[1].left;
			}
			//if both exists, we push the pair of both trees on to the stack
			else
			{
				stack.push(new TreeNode[] {t[0].left, t[1].left});
			}
			
			//if the right of 1st tree is absent, use the right child
			//of the 2nd tree
			if(t[0].right == null)
			{
				t[0].right = t[1].right;
			}
			//if both exists, we push the pair of both trees on to the stack
			else
			{
				stack.push(new TreeNode[] {t[0].right, t[1].right});
			}
		}
		return n1;
		*/
	}
	
	public static void main(String[] args)
	{
		MergeTrees merge = new MergeTrees();
		//MergeTrees t2 = new MergeTrees();
		TreeNode n1 = new TreeNode(1);
		n1.left = new TreeNode(3);
		n1.right = new TreeNode(2);
		
		n1.left.left = new TreeNode(5);
		
		
		TreeNode n2 = new TreeNode(2);
		n2.left = new TreeNode(1);
		n2.right = new TreeNode(3);
		
		n2.left.right = new TreeNode(4);
		
		n2.right.right = new TreeNode(7);

		
		System.out.println(merge.mergeTrees(n1, n2));
		
	}
}
