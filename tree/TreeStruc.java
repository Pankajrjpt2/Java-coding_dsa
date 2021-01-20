package tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int x){
		data = x;
	}
}
public class TreeStruc {
	
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data + ", ");
			inOrder(root.right);
		}
	}
	
	public void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data +", ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	public void postOrder(Node root) {
		if(root!=null) {
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data +", ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeStruc t = new TreeStruc();
		Node root = new Node(50);
		root.left = new Node(40);
		root.right = new Node(60);
		root.left.left = new Node(20);
		System.out.print("Inorder - ");
		t.inOrder(root);
		
		System.out.println();
		System.out.print("Preorder - ");
		t.preOrder(root);
		
		System.out.println();
		System.out.print("Postorder - ");
		t.postOrder(root);
		
	}

}
