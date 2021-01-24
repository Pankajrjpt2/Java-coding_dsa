package rougth;

public class EqulibiriumPoint {
	static int equilibriumPoint(long a[], int n) {
	    long sum1=0,sum2=0;
	    for(int i=0;i<n;i++){
	        int j = i;
	        while(j>0){
	            sum1=sum1+a[j-1];
	            j--;
	        }
	        int k = i;
	        while(k!=n-1){
	            sum2=sum2+a[k+1];
	            k++;
	        }
	        if(sum1==sum2){
	            return i+1;
	        }
	        sum1=0; sum2=0;
	    }
	    return -1;
	    // Your code here
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a[] = {20, 17, 42, 25, 32, 32, 30, 32, 37, 9, 2, 33, 31, 17, 14, 40, 9 ,12, 36, 21, 8 ,33, 6, 6, 10, 37, 12, 26, 21, 3};
		int n = a.length;
		System.out.println(equilibriumPoint(a, n));
	}

}
