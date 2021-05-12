package BinarySearchTree;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(33);
		bst.insert(40);
		bst.insert(20);
		bst.insert(24);
		bst.insert(18);
		bst.insert(41);
		bst.insert(36);
		
		
//		System.out.println("inorder traversal");
//		bst.inorder(bst.getRoot());
//		
//		System.out.println("\npreorder traversal");
//		bst.preorder(bst.getRoot());
//		
//		System.out.println("\npostorder traversal");
//		bst.postorder(bst.getRoot());
//		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("\nEnter a number to delete:");
//		int x = scn.nextInt();
//		
//		if(bst.delete(x)) {
//			System.out.println(x + " is deleted, after delete the inorder is \n");
//			bst.inorder(bst.getRoot());
//		}
//		else
//			System.out.println(x + " is not on the tree");
		
		System.out.println(bst.theShowMustGoOn(bst.getRoot()));
		
		
		

		

	}

}
