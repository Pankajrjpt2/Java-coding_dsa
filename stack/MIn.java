package stack;
import java.util.*;
public class MIn {
	Stack<Integer> ms;
	Stack<Integer> as;
	MIn(){
		 ms = new Stack<Integer>();
		 as = new Stack<Integer>();
	}
	
	
	public void push(int x) {
		
		if(ms.isEmpty()) {
			ms.add(x);
			as.add(x);
			return;
		}
		ms.add(x);
		if(ms.peek()<=as.peek()) {
			as.add(x);
		}
	}
	
	public void pop() {
		if (as.peek()==ms.peek()) {
			
			as.pop();
		}
		ms.pop();
	}
	public int min() {
		return as.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MIn s = new MIn();
		s.push(12);
		s.push(5);
		s.push(3);
		s.pop();
		s.push(2);
		s.push(1);
		s.pop();
		
		System.out.println(s.min());
		

	}

}
