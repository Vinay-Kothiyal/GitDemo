package javaPractice;

public class Reverse1 {
	public static void main(String[] args) {
		String q="My name is Vinay";
		String w="";
		for(int i=q.length()-1;i>=0;i--) {
			w=w+q.charAt(i);
		}
		System.out.println(w);
		
	}
	

}
