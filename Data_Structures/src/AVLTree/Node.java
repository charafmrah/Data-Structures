package AVLTree;

public class Node {
    int key;
    int height;
    Node left;
    Node right;

    
   public Node(int key) {
	   this.key = key;
	   this.height = 0;
	   this.left = null;
	   this.right = null;
   }


public int getKey() {
	return key;
}


public void setKey(int key) {
	this.key = key;
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
