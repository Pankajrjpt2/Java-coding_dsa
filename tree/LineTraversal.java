package tree;
import java.util.*;
public class LineTraversal {
	void lineTraversal(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(q.size()>1) {
			Node curr = q.poll();
			if(curr==null) {
				System.out.println();
				q.add(null);
				continue;
			}
			System.out.print(curr.data +"  ");
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
		LineTraversal l = new LineTraversal();
		Node root = new Node(50);
		root.left = new Node(40);
		root.right = new Node(80);
		root.left.left = new Node(60);
		root.left.right = new Node(70);
		root.left.left.left = new Node(10);
		l.lineTraversal(root);
	}

}
