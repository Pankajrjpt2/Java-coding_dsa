package tree;
/*class Node{
	int data;
	Node left;
	Node right;
	Node(int x){
		data = x;
		left = right = null;
	}
	
}*/
public class HeightTree {
	public int heightTree(Node root) {
		if(root==null) {
			return 0;
		}
		else
			return Math.max(heightTree(root.left), heightTree(root.right))+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightTree h = new HeightTree();
		Node root = new Node(50);
		root.left = new Node(40);
		root.right = new Node(80);
		root.left.left = new Node(60);
		root.left.right = new Node(70);
		root.left.left.left = new Node(10);
		
		System.out.println(h.heightTree(root));
	}

}
