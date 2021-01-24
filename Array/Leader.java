package rougth;
import java.util.*;
public class Leader {
	 static ArrayList<Integer> leaders(int arr[], int n){
	        // Your code here
		 	int j;
	        
	        ArrayList<Integer> a = new ArrayList<Integer>();
	        for(int i=0;i<n;i++){
	        	boolean flag=true;
	            j=i+1;
	            while(j!=n){
	                if(arr[i]<arr[j]){
	                	
	                    flag=false;
	                    j++;
	                    break;
	                }
	                j++;
	            }
	            if(flag==true){
	                    a.add(arr[i]);
	                }
	            
	        }
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {16,17,4,3,5,9,4,1};
		int n = arr.length;
		System.out.println(leaders(arr,n));
	}

}
