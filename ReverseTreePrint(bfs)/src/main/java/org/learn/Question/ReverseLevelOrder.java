package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.learn.PrepareTree.Node;

public class ReverseLevelOrder {

	public static void reverseLevelOrder(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		Stack <Node> stack = new Stack<Node>();
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			stack.push(node);
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		while(!stack.isEmpty()) {
			System.out.printf("%d ",stack.pop().data);
		}
	}
}
