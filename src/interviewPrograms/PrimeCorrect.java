package interviewPrograms;

public class PrimeCorrect {

	public static void main(String[] args) {
		int n = 2, temp = 0;
		for (int q = 2; q <= n-1; q++) {
			if (n % q == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("No. is not prime");
		} else {
			System.out.println("No. is prime");
		}

	}

}
