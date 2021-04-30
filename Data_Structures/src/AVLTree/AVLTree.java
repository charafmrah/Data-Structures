package AVLTree;

import BinarySearchTree.TreeNode;

// Source: https://www.baeldung.com/java-avl-trees 

public class AVLTree {

    private Node root;
    int size;
    
    public AVLTree() {
    	this.root = null;
    	this.size = 0;
    }
    
    void updateHeight(Node n) {
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    // Calculate height
    int height(Node n) {
        return n == null ? -1 : n.height;
    }
    
    // Calculate the balance of a node
    int getBalance(Node n) {
        return (n == null) ? 0 : height(n.right) - height(n.left);
    }
    
    public Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        } else if (node.key > key) {
            node.left = insert(node.left, key);
        } else if (node.key < key) {
            node.right = insert(node.right, key);
        } else {
            throw new RuntimeException("duplicate Key!");
        }
        size++;
        return rebalance(node);
    }
    
    // Right rotation
    public Node rotateRight(Node y) {
        Node x = y.left;
        Node z = x.right;
        x.right = y;
        y.left = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }
    
    // Left rotation
    public Node rotateLeft(Node y) {
        Node x = y.right;
        Node z = x.left;
        x.left = y;
        y.right = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }
    
    // Re-balancing 
    public Node rebalance(Node z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance > 1) {
            if (height(z.right.right) > height(z.right.left)) {
                z = rotateLeft(z);
            } else {
                z.right = rotateRight(z.right);
                z = rotateLeft(z);
            }
        } else if (balance < -1) {
            if (height(z.left.left) > height(z.left.right))
                z = rotateRight(z);
            else {
                z.left = rotateLeft(z.left);
                z = rotateRight(z);
            }
        }
        return z;
    }

    public Node delete(Node node, int key) {
        if (node == null) {
            return node;
        } else if (node.key > key) {
            node.left = delete(node.left, key);
        } else if (node.key < key) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null || node.right == null) {
                node = (node.left == null) ? node.right : node.left;
            } else {
                Node mostLeft = node;
                mostLeft = mostLeft.mostLeftChild(node.right);
                node.key = mostLeft.key;
                node.right = delete(node.right, node.key);
            }
        }
        if (node != null) {
            node = rebalance(node);
        }
        size--;
        return node;
    }
    
//    private Node mostLeftChild(Node current) {
//    	Node parentOfRightMost = current;
//		Node leftMost = current.getLeft();
//		while (leftMost.getRight() != null) {
//			parentOfRightMost = leftMost;
//			leftMost = leftMost.getRight(); // Keep going to the right
//		}
//		return leftMost;
//	}

	public String search(int key) {
        Node current = root;
        while (current != null) {
            if (current.key == key) {
                break;
            }
            current = current.key < key ? current.right : current.left;
        }
        return "Found";
    }
    
}
