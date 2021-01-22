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
public class CheckSumChild {
	public boolean sumChild(Node root) {
		if(root==null) {
			return true;
		}
		if(root.left==null && root.right==null) {
			return true;
		}
		int sum=0;
		if(root.left!=null) {
			sum+=root.left.data;
		}
		if(root.right!=null) {
			sum+=root.right.data;
		}
	
		return (root.data == sum && sumChild(root.left) && sumChild(root.right));
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSumChild c = new CheckSumChild();
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(12);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		if(c.sumChild(root)) {
			System.out.println("Yes, children sum is equal to Parent");
		}
		else {
			System.out.println("No, children sum is'nt equal to Parent");
		}

	}

}
