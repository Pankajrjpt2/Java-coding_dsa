package stack;

import java.util.*;

public class SecondLargest {
	
	
	public static ArrayList<Integer> largest(int arr[], int n){
		Stack<Integer> s = new Stack<Integer>();
		ArrayList<Integer> v = new ArrayList<Integer>();
		s.add(arr[n-1]);v.add(-1);
		
		for (int i = n-2; i > 0; i--) {
			while(s.isEmpty()==false && s.peek()<=arr[i]) {
				s.pop();
			}
			int ng = s.isEmpty()?-1:s.peek();
			v.add(ng);
			s.add(arr[i]);
		}
		Collections.reverse(v);
		return v;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,15,10,8,6,12,9,18};
		int n = arr.length;
		System.out.println(largest(arr,n));

	}

}
