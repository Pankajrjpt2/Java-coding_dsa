package linkedlist;
class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}
public class LinkedList {
	
//	this Method for enter element in first of the Linkedlist
	public Node first(Node head,int x) {
		Node temp = new Node(x);
		temp.next = head;
		return temp;
		
	}
	
//	this Method for enter element in last of the LinkedList
	public Node last(Node head,int x) {			
		Node temp = new Node(x);
		if(head==null) {
			return temp;
		}
		else {
			Node curr=head;
			while(curr.next!=null) {
				curr =curr.next;
			}
			curr.next = temp;
		}
		return head;
	}
	
// This method is use for enter element in the given position
	public Node positionInsert(Node head,int pos, int x) {
		Node temp = new Node(x);
		if(pos==1) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		for (int i = 1; i <= pos-2 && curr!=null ; i++) {
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
		
	}

//	this Method is Print LinkedList
	public void print(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
		
	}
	
//	this method is use for delete the 1st element in the linkedlist
	public Node deleteFirst(Node head) {
		if(head==null) {
			return null;
		}
		else {
			head = head.next;
		}
		return head;
	}
	
//	this method is use for delete dupicate
	public void duplicate(Node head) {
		Node curr = head;
		while(curr!=null && curr.next!=null) {
			if(curr.data==curr.next.data) {
				curr.next = curr.next.next;
			}
			else {
				curr = curr.next;
			}
		}
	}
	
	public Node sortWithValue(Node head,int x) {
		Node temp = new Node(x);
		if(head==null) {
			return temp;
		}
		else if (head.data>x) {
			temp.next= head;
			return temp;
		} 
		Node curr = head;
		
		while(curr.next!=null && curr.next.data<x) {
			curr = curr.next;
		}
				temp.next = curr.next;
				curr.next = temp;	
		return head;
	}
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		Node head = null;
	
		head = l.first(head,80);
		head = l.first(head,70);
		head = l.first(head,60);
		head = l.first(head,50);
//		head = l.last(head,);
		head = l.first(head,40);
		head = l.first(head,30);
		head = l.first(head,20);
		l.print(head);
		l.sortWithValue(head, 35);
		l.print(head);
//		System.out.println("after delete first element");
//		head = l.deleteFirst(head);
//		l.print(head);
//		l.positionInsert(head, 2, 18);
//		l.print(head);
//		l.duplicate(head);
//		l.print(head);
		
	}
}
