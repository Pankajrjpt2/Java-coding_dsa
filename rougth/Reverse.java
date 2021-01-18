package rougth;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int n=arr.length;
		int low = 0;
		int high = n-1;
		while(low<=high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
		System.out.println(Arrays.toString(arr));
		
}
}
