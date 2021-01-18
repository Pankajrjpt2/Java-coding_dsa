package rougth;

import java.util.Arrays;

public class Insert {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		int n = arr.length;
		int pos = 3;
		int x = 80;
		int[] temp = new int[n+1];
		for (int i = temp.length -1; i >=0; i--) {
			if(i<pos) {
				temp[i] = arr[i];
				
			}
			else if(i==pos) {
				temp[i] = x;
			}
			else {
				temp[i]=arr[i-1];
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
	}
}
