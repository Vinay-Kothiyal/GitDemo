package string;

public class ReverseString {
	public static void main(String[] args) {
		String sub="Java is easy";
		for(int i=sub.length()-1;i>=0;i--) {
			System.out.print(sub.charAt(i));
		}
	}

}
