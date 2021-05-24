package javaPractice;

public class StringSlice {
	public static void main(String[] args) {
		String q="I am batman";
		String w=" ";
		String[] e=q.split(w);
		for(String r:e) {
			System.out.print(r);
		}
	}

}
