package rougth;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}
public class LinkedList {
	public static Node insertValue(Node head, int x ) {
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}
	public static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		Node head = null;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			
			int x = scan.nextInt();
			head = insertValue(head,x);
			
		}
		
		printList(head);
		
		
	}
}
