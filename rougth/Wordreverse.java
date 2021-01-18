package rougth;

import java.util.Scanner;

class Wordreverse {
		void reverse(char[] str,int low,int high) {
		while(low<=high) {
			char temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			low++;
			high--;
		}
	}
		void reverseword(char[] str, int n) {
			int start=0;
			for (int i = 0; i < n; i++) {
				if(str[i]==' ') {
					reverse(str,start,i-1);
					start=i+1;
				}
			}
			reverse(str,start,n-1);
			reverse(str,0,n-1);
			String s = new String(str);
			
			System.out.print(str);
			
		}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Wordreverse w = new Wordreverse();
		int i=1;
		System.out.println(i++ +""+ ++i +""+ i++);
		String s = scan.nextLine();
		char[] str = s.toCharArray();
		int n = str.length;
		w.reverseword(str,n);
	}
}


//sorry for inconvinience
//yrros rof ecneinivnocni
//inconvinience for sorry
