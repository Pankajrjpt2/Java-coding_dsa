package queue;
class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}
public class QueueLinkedList {
	Node front,rear;
	QueueLinkedList(){
		front = rear = null;
	}
	
	void enque(int x) {
		Node temp = new Node(x);
		if(rear==null) {
			front = rear = temp;
			return;
		}
		rear.next = temp;
		rear = temp;
	}
	
	void deque() {
		if(front==null) {
			System.out.println("This operation is not performed because queue is empty");
		}
		front = front.next;
		if(front==null) {
			rear=null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList ql = new QueueLinkedList();
		ql.enque(2);
		ql.enque(3);
		ql.enque(4);
		ql.enque(5);
		ql.deque();
		System.out.println(ql.rear.data);
		System.out.println(ql.front.data);
	}

}
