package stack;

import java.util.*;

public class Min2 {
	Stack<Integer> s = new Stack<Integer>();
	int min;
	public void push(int x) {
	if (s.isEmpty()) {
		s.add(x);
		min = x;
		return;
	}
	if (x<=min) {
		s.add(x-min);
		min = x;
	}
	
	}
	
	public void pop() {
		if (s.peek()<0) {
			min = -s.peek()+min;
			s.pop();
		}
	}
	
	public int min() {
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Min2 p = new Min2();
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
//		p.pop();
		System.out.println(p.min());
		p.pop();
		System.out.println(p.min());
		p.pop();
		System.out.println(p.min());
		p.pop();
		System.out.println(p.min());
		p.pop();
		System.out.println(p.min());
	}

}
