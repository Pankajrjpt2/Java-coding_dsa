package stack;

public class Maxarea {
	public static int maximum(int a, int b) {
		
		return (a>b?a:b);
	}
	public static int max(int arr[], int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			int curr= arr[i];
			for (int j = i-1; j >=0; j--) {
				if (arr[j]>=arr[i]) {
				curr+=arr[i];
				}
				else {
				break;
				}
			}
			
			for (int j = i+1; j<n; j++) {
				if (arr[j]>=arr[i]) {
				curr+=arr[i];
				}
				else {
				break;
				}
			}
			res = maximum(curr,res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,2,5,4,1,5,6};
		int n = arr.length;
		System.out.println("maximum area is - "+max(arr,n));
		}
	

}
