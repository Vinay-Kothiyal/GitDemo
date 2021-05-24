package interviewPrograms;

public class Factorial {
	
	public static void main(String[] args) {
	int n=4;
	int temp=1;
	for(int i=1;i<=n;i++) {
		temp=i*temp;
	}
	System.out.println("Factorial is "+temp);
	
	}


}
