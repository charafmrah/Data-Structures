package AVLTree;

public class Node {
    int data;
    int height;
    Node left, right, parent;

    
   public Node(int key) {
	   this.data = key;
	   this.height = 1;
	   this.left = null;
	   this.right = null;
   }

	public int getKey() {
		return data;
	}
	
	
	public void setKey(int key) {
		this.data = key;
	}
	
	
	public int getHeight() {
		return height;
	}
	
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public Node getLeft() {
		return left;
	}
	
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	
	public Node getRight() {
		return right;
	}
	
	
	public void setRight(Node right) {
		this.right = right;
	}
   
   
}
