package queue;

import java.util.*;

public class GenerateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new ArrayDeque<String>();
		 Scanner scan = new Scanner(System.in);
		 	System.out.print("Enter 1st number in which you want generate number - ");
			String s = scan.nextLine();
			q.offer(s);
			System.out.print("Enter 2nd number in which you want generate number - ");
			String s1 = scan.nextLine();
			q.offer(s1);
			System.out.print("How mant number you want to generate - ");
			
			int n= scan.nextInt();
			
			System.out.println("Generated Number's ");
		for (int i = 1; i <= n; i++) {
			String curr = q.remove();
			System.out.print(curr+", ");
			q.add(curr+s);
			q.add(curr+s1);
		}
	}

}
