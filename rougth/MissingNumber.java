package rougth;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,8};
		int c = 0;
		int a = arr.length;
		int b = (a*(a+1))/2;
		int i=0;
		while(i<a) {
		c = c+arr[i];
		i++;
		}
		System.out.println(c);
		System.out.println(b);
		System.out.println("Missing Value is "+(b-c));
	}
}
