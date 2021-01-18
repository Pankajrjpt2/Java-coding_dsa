package rougth;

public class Panagram {
	public boolean Pana(String s) {
		if(s.length()<26) {
			return false;
			
		}
		else {
			for (char ch = 'a';  ch <= 'z'; ch++) {
				if (s.indexOf(ch)<0) {
					
					return false;
				}
			}
		}
		return true;
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefghijklmnopqrstuvwxyz";
		Panagram str = new Panagram();
		System.out.println(str.Pana(s));

	}

}
