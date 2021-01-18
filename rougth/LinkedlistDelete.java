package rougth;
import rougth.*;

public class LinkedlistDelete {
	public Node delete(Node head) {
		if(head==null) {
			return null;
		}
		else {
			return head.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedEnd a = new LinkedEnd();
		LinkedlistDelete b = new LinkedlistDelete();
		
		Node head = null;
		head = a.enter(head,45);
		head = a.enter(head,87);
		head = a.enter(head,59);
		a.show(head);
		head = b.delete(head);
		head = b.delete(head);
		a.show(head);
	}

}
