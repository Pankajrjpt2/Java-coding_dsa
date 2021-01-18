package stack;

import java.util.*;

public class Brackets {
	 boolean matching(char a, char b) {
		return((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}') );
	}
	public boolean check(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ) {
				st.add(s.charAt(i));
			}
			else {
				if(st.isEmpty()==true) {
					return false;
				}
				else if(matching(st.peek(),s.charAt(i))==false) {
					return false;
				}
				else {
					st.pop();
				}
			}
		}
		return (st.isEmpty()==true);
	}
	public static void main(String[] args) {
		Brackets b = new Brackets();
		if(b.check("{(})")==true){
			System.out.println("Balance");		
			}
		else {
			System.out.println("Not Balance");
		}
		

	}

}
