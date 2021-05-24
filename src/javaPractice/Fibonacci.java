package javaPractice;

public class Fibonacci {
	
	public static void main(String[] args) {
		int q=0;
		int w=1;
		int c;
		System.out.println(q);
		System.out.println(w);
		for(int i=1; i<=10;i++) {
			c=q+w;
			q=w;
			w=c;
			
			System.out.println(c);
		}
	}

}
