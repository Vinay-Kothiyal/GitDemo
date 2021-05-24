	package string;

public class RevSentence {
	public static void main(String args[]) {
		String a = "I am Batman";
		String temp[] = a.split(" ");
		for (int i = temp.length - 1; i >= 0; i--) {
			System.out.print(temp[i] + " ");

		}

	}
}