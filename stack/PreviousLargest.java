package stack;
import java.util.*;

public class PreviousLargest {
	public static ArrayList<Integer> largest(int arr[], int n){
		ArrayList<Integer> v = new ArrayList<Integer>();
		Stack<Integer> s = new Stack<Integer>();
		s.add(arr[0]); v.add(-1);
		for (int i = 1; i < arr.length; i++) {
			while(s.isEmpty()==false && s.peek()<=arr[i]) {
				s.pop();
			}
			int ag = s.empty() ? -1:s.peek();
			v.add(ag);
			s.add(arr[i]);
		}
		return v;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,15,10,8,6,12,9,18};
		int n = arr.length;
		System.out.println(largest(arr,n));

	}

}
