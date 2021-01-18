package linkedliststack;
class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}



public class Llstack {
	Node head;
	int size;
	Llstack(){
		head = null;
		size=0;
	}
	
	void push(int x) {
		Node temp = new Node(x);
		if(head==null) {
			temp.next = head;
			head = temp;
			size++;
		}
		else {
			Node curr = head;
			while(curr.next!=null) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next=null;
			size++;
		}
	}
	
	void show() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(" " + curr.data);
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		Llstack s = new Llstack();
		s.push(12);
		s.push(2);
		s.push(16);
		s.show();
	}

}
