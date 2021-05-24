package interviewPrograms;

public class Prime {
	
	public static void main(String[] args) {
		int n=5;
		
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				System.out.println("no. is not prime");
			}
			else {
				System.out.println("Prime");
			}
			
		}
	}

}
