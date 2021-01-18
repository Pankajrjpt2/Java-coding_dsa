package queue;

import java.util.Arrays;

public class QueueOperartion {
	int cap,size;
	static int arr[];
	QueueOperartion(int x){
		cap = x;
		size = 0;
		arr = new int[cap];
	}
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size==cap;
	}
	public void enqueue(int x) {
		if(isFull()) {
			System.out.println("queue is full");
		}
		else {
			arr[size] = x;
			size++;
		}
	}
	
	public int deque() {
		int res = arr[0];
		for (int i = 0; i < size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		return res;
	}
	
	public int front() {
		return arr[0];
	}
	
	public int rear() {
		return arr[size-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueOperartion q = new QueueOperartion(5);
		q.enqueue(12);
		q.enqueue(18);
		q.enqueue(7);
		q.deque();
		q.enqueue(12);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(q.front());
		System.out.println(q.rear());
	}

}
