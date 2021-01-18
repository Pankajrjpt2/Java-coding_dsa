package rougth;



public class CountVowels {
	static void vowels(String s) {
		int count = 0;
		
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' | s.charAt(i)=='u' ) {
				str = str+"," + s.charAt(i);
				count++;
				
				
			
			}
		}
		System.out.println(str +" and the Number of vowels is = " +  count);
	}
	public static void main(String[] args) {
		String s = "Pankaj Rajput";
		vowels(s);
	}
}
