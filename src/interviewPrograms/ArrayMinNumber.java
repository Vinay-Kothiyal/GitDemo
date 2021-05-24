package interviewPrograms;

public class ArrayMinNumber {
	public static void main(String[] args) {
		int[] arr = { 8, 3, 2, 7, 1 };
		System.out.println(arr.length);
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			}
		}
		System.out.println(min);
	}
}
//1=3,2=2,3=2,4=1