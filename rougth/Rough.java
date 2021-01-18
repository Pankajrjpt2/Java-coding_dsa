package rougth;

public class Rough {
	static int b = 15;
	void inner(int a) {
		b = a;
		System.out.println(b);
	}
	public static void main(String args[])
	   { 
		Rough r = new Rough();
		r.inner(85);
		
		
	    }    

}
