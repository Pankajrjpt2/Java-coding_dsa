package stack;

import java.util.*;

public class Postfix {
	public static int res(String s) {
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				continue;
			}
			else if (Character.isDigit(ch)) {
				int n = 0; 
                
                while(Character.isDigit(ch)) 
                { 
                    n = n*10 + (int)(ch-'0'); 
                    i++; 
                    ch = s.charAt(i); 
                } 
                i--; 
				st.push(n);
			}
			else {
				int val1 = st.pop() ;
				int val2 = st.pop() ;
				
				switch(ch) {
				
				case '+':{
					
					st.push(val1 + val2);
					break;
				}
				
				case '-':{
					
					st.push(val1 - val2);
					break;
				}
				
				case '*':{
					st.push(val1 * val2);
					break;
				}
				
				case '/':{
					st.push(val2 / val1);
					break;
				}
				
				case '^':{
					st.push(val1 ^ val2);
					break;
				}
				}
			}
		}
		return st.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "100 200 + 2 / 5 * 7 +"; 
		System.out.println(s);
		System.out.println(res(s));
	}

}
