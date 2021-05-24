package interviewPrograms;

public class ArrayMaxNumber {
	public static void main(String[] args) {
		int[] a = { 2, 7, 9, 3, 8 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
