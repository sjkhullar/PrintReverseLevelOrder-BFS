package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.PrepareTree.Tree;
import org.learn.Question.ReverseLevelOrder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int[] arrData = { 50, 150, 25, 80, 125, 160};
		Tree tree = new Tree();
		Node root = tree.createNode(100);
		for (int data : arrData) {
			tree.insert(root, data);
		}
		System.out.println("Reverse Level Order Traversal");
		ReverseLevelOrder.reverseLevelOrder(root);
	}
}
