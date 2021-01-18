package rougth;

public class leftmostnonrepeat {
	
	static final int CH = 356;
	static String repeat(String str) {
		String s="";
		int count[] = new int[CH];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
			
		}
		for (int j = 0; j < str.length(); j++) {
			if(count[str.charAt(j)]==1) {
				s = s +" "+ str.charAt(j);
			}
		}
	return s;	
	}
	public static void main(String[] args) {
		String str = "geeksforgeleks";
		System.out.println(repeat(str));
		
	}

}
 