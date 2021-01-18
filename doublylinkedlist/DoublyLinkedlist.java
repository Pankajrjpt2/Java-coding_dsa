package doublylinkedlist;
class Node{
	int data;
	Node next;
	Node prev;
	Node(int x){
		data = x;
		next = null;
		prev = null;
		
	}
}
public class DoublyLinkedlist {
	public Node doublyFirst(Node head,int x) {
		Node temp = new Node(x);
		temp.next = head;
		if(head != null) {
			head.prev = temp;
		}
		return temp;
		
	}
	

	public void doublyPrint(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data +" ");
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedlist D = new DoublyLinkedlist();
		Node head = null;
		head =  D.doublyFirst(head, 15);
		head =  D.doublyFirst(head, 1);
		head =  D.doublyFirst(head, 95);
		D.doublyPrint(head);
	}

}
