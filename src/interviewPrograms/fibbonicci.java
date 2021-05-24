package interviewPrograms;

public class fibbonicci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int c = 0; c <= 10; c++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
//		int temp;
//		System.out.print(a + " " + b);
//		for (int c = 0; c <= 10; c++) {
//			temp = a + b;
//			a = b;
//			b = temp;
//			System.out.print(" " + temp);
		}
	}
}
