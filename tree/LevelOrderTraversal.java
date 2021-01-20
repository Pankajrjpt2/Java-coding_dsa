package tree;

import java.util.*;
/*class Node{   //this is already define in tree package that why i comment this  
int data;
Node left;
Node right;
Node(int x){
	data = x;
	left = right = null;
}

}*/
public class LevelOrderTraversal {
	void Travers(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node> q = new ArrayDeque<Node>();
		q.add(root);
		while(q.isEmpty()!=true) {
			Node curr = q.poll();
			System.out.print(curr.data+", ");
			if(curr.left!=null) {
				q.add(curr.left);
			}
			
			if(curr.right!=null) {
				q.add(curr.right);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal t = new LevelOrderTraversal();
		Node root = new Node(50);
		root.left = new Node(40);
		root.right = new Node(80);
		root.left.left = new Node(60);
		root.left.right = new Node(70);
		root.left.left.left = new Node(10);
		
		System.out.print("Print element by Level order traversal  - ");
		t.Travers(root);
		
	}

}
