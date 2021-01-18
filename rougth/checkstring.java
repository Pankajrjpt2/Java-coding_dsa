package rougth;

public class checkstring {
	public static void main(String[] args) {
		int x =5,y=3;
		int res = --x>=y++?x--:x-->++y?++x:--y;
		System.out.println(res);
	}
}
