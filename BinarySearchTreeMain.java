package com.bridgelab.binarytree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Binary Search Tree programms");
		BinaryTreeService BST = new BinaryTreeService();
		BST.insert(56);
		BST.insert(30);
		BST.insert(70);
		System.out.println("The Binary Sarch Tree is:"+" "+BST);
	}

}
