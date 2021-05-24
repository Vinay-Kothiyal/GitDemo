package interviewPrograms;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "JAVA is easy";
		String rev="";
		String a[] = s.split(" ");
		for (int i = a.length - 1; i >= 0; i--) {
			rev="";
			for(int j = a[i].length()-1; j>=0;j--) {
				rev=rev+a[i].charAt(j);
			}
			System.out.println(""+rev);
		}
	}
}
