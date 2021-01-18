package rougth;

public class Patternmatch {
	
	static void match(char[] ch1, char[] ch2 ) {
		int n = ch1.length;
		int m = ch2.length;
		boolean mat = false; 
		
		for (int i = 0; i <= (n-m) ; i++) {
			int j;
			for (j = 0; j < m; j++) {
				
				if (ch2[j]!=ch1[i+j]) {
					
					break;
				}
				
			}
			if (j==m) {
				System.out.println("Pattern Match from "+(i+1)+" to "+(i+j));
				mat=true;
				
			}
			
		}
		
		if (mat==false) {
			System.out.println("Pattern does'nt Match with given String ");
		}
	}
	public static void main(String[] args) {
		
		String str = "ABCABDasACDasaACD";
		String ptr = "ABCD";
		char[] ch1 = str.toCharArray();
		char[] ch2 = ptr.toCharArray();
		
		match(ch1,ch2);
		
	}
}
