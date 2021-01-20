package tree;

public class KthLevelPrint {
	void printLevel(Node root,int x) {
		if(root==null) {
			return;
		}
		if(x==0) {
			System.out.print(root.data +", ");
		}
		else
			printLevel(root.left,x-1);
			printLevel(root.right,x-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthLevelPrint k = new KthLevelPrint();
		Node root = new Node(50);
		root.left = new Node(40);
		root.right = new Node(80);
		root.left.left = new Node(60);
		root.left.right = new Node(70);
		root.left.left.left = new Node(10);
		System.out.print("Elements in 'kth' level  - ");
		k.printLevel(root, 2);
	}

}
