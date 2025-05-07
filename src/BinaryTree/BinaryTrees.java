package BinaryTree;
import java.util.*;

public class BinaryTrees {

	static class Node {
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	static class BinaryTree {
		static int idx = -1;
		static int count = 0;
		/**
		 * @param nodes
		 * @return
		 */
		/**
		 * @param nodes
		 * @return
		 */
		public static Node buildBinaryTree(int nodes[]) { //PreOrder
			idx++;
			if(nodes[idx]==-1)
			{
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildBinaryTree(nodes);
			newNode.right = buildBinaryTree(nodes);
			return newNode;
		}
		
		public static Node insertion(Node root, Node value) {
			if(root.left == null)
			{
				root.left = value;
			}
			else if (root.right == null)
			{
				root.right = value;
			}
			else
			{
				insertion(root.left, value);
			}
			return root;
		}
		
		public static int countNodes(Node root)
		{    
			if(root == null)
			{
				return 0;
			}
			return 1 + countNodes(root.left) + countNodes(root.right);
		}
		
		public static int sumOfNodes(Node root) {
			if(root == null)
			{
				return 0;
			}
			return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
		}
		
		public static int heightOfTree(Node root)
		{    
			if(root == null)
			{
				return 0;
			}
			int leftHeight = heightOfTree(root.left);
			int rightHeight = heightOfTree(root.right);
			
			return Math.max(leftHeight, rightHeight) + 1;
		}
		
		public static void preOrder(Node root)
		{
			if(root == null) {
				return;
			}
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	
		public static void postOrder(Node root)
		{
			if(root == null) {
				return;
			}
			System.out.println(root.data);
			postOrder(root.right);
			postOrder(root.left);
			
		}
		
		public static void inOrder(Node root)
		{
			if(root == null) {
				return;
			}
			
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
			
		}
		
		public static void levelOrder(Node root) //BFS
		{
			if(root == null)
			{
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty())
			{
				Node currNode = q.remove();
				if(currNode == null)
				{ System.out.println();
				if(q.isEmpty())
				{
					break;
				}
				else
				{
					q.add(null);
				}
				}
			else
			{
				System.out.println(currNode.data+"");
				if(currNode.left != null)
				{
					q.add(currNode.left);
				}
				if(currNode.right != null)
				{
					q.add(currNode.right);
				}
			}}
			
		}
		
		
		public static int diameter(Node root)
		{
			return 0;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		
		//Building a binary tree from an array
		BinaryTree bt = new BinaryTree();
		Node root = bt.buildBinaryTree(nodes);
		System.out.println(root.data);
		
		
		//Binary Tree traversals
		System.out.println("Preorder");
		preOrder(root);
		System.out.println("Postorder");
		postOrder(root);
		System.out.println("Inorder");
		inOrder(root);
		System.out.println("Levelorder");
		levelOrder(root);
		System.out.println("Count: ");
		System.out.println(countNodes(root));
		System.out.println("Sum of Nodes: ");
		System.out.println(sumOfNodes(root));
		System.out.println("Height of Tree: ");
		System.out.println(heightOfTree(root));
		Node n1 = new Node(10);
		insertion(root, n1);
		System.out.println("Preorder");
		preOrder(root);
	}


	}
}
