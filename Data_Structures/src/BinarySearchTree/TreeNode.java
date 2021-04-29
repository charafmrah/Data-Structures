package BinarySearchTree;


public class TreeNode {

	private int element;
	private TreeNode left;
	private TreeNode right;

	
	public TreeNode(int newElement) 
	{
		element = newElement;
		left = null;
		right = null;
	}

	public int getElement()
	{
		return element;
	}

	public void setElement(int newElement)
	{
		element = newElement;
	}

	
	public TreeNode getLeft()
	{
		return left;
	}

	public void setLeft(TreeNode newLeft)
	{
		left = newLeft;
	}

	public TreeNode getRight()
	{
		return right;
	}

	public void setRight(TreeNode newRight)
	{
		right = newRight;
	}

}
