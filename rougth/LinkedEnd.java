package rougth;
import rougth.*;
public class LinkedEnd {
	public Node enter(Node head, int x) {
		Node temp = new Node(x);
		
		if(head==null) {
			return temp;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}
	public void show(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		LinkedEnd a = new LinkedEnd();
		head = a.enter(head,15);
		head = a.enter(head,75);
		head = a.enter(head,5);
		a.show(head);
		
	}

}
