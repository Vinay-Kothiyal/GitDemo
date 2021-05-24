package interviewPrograms;

public class StringExample1 {
	public static void main(String[] args) {
	String s = "JAVA is easy";
	String a[]=s.split(" ");
	for(int i = a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	}
}
