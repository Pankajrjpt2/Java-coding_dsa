package queue;
import java.util.*;
public class Queuejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		q.offer(15);
		q.offer(4);
		q.offer(78);
		q.remove();
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		
	}

}
