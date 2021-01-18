package rougth;

import java.util.Arrays;

public class Anagram {
	static void check(char[] ch1,char[] ch2) {
		int n = ch1.length;
		int m = ch2.length;
		boolean q = false;
		for (int i = 0; i < (n-m); i++) {
			
			boolean b= anag(ch1,ch2,i,m);
			if (b==true) {
				System.out.println("yes its anagram");
				q = true;
			}
			
			
		}
		if (q==false) {
			System.out.println("No its not anagram");
		}
	}
	static boolean anag(char[] ch1, char[] ch2,int i,int m) {
		
		
		char[] temp = new char[m];
		for (int j = 0; j < m; j++) {
			
			temp[j] = ch1[i+j];
			
		}
		Arrays.sort(ch2);
		Arrays.sort(temp);
		String str1 = new String(ch2);
		String str2 = new String(temp);
		if (str1.equals(str2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "geeksfeorgeeks";
		String ptr = "frog";
		char[] ch1 = str.toCharArray();
		char[] ch2 = ptr.toCharArray();
		
		check(ch1,ch2);
		
		
	}
}
