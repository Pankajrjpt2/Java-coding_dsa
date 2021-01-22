package tree;
/*class Node{   //this is already define in tree package that why i comment this  
int data;
Node left;
Node right;
Node(int x){
	data = x;
	left = right = null;
}

}*/
public class MaxTree {
	public int max(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		else {
			return Math.max(root.data,Math.max(max(root.left), max(root.right)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxTree m = new MaxTree();
		Node root = new Node(50);
		root.left = new Node(40);
		root.right = new Node(80);
		root.left.left = new Node(60);
		root.left.right = new Node(70);
		root.left.left.left = new Node(10);
		System.out.print("Maximum in Tree - ");
		System.out.println(m.max(root));
	}

}
