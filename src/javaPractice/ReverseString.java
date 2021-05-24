package javaPractice;

public class ReverseString {
	public static void main(String[] args) {
	String s="Vinay";
	String b="";
	for(int i=s.length()-1;i>=0;i--){
		b=b+s.charAt(i);
		//System.out.print(s.charAt(i));
	}
	System.out.println(b);
} 
}

