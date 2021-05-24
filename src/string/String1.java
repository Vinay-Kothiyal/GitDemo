package string;

public class String1 {

	public static void main(String[] args) {
		String s1 = "qwe";
		char ch[] = { 'a', 's', 'd', 'e' };
		String s2 = new String(ch);
		String s3 = new String("cvbnm");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.charAt(1));
		System.out.println(s1.length());
		System.out.println(s1.split("w"));
		String a[]=s1.split("w");
		System.out.println(a[1]);
		s1.replace('w','o');
		s1.toUpperCase();
		System.out.println(s1.replace('w','o').toUpperCase());
		String name="Sachin";
		name.concat("Tendulkar");
		System.out.println(name);
		System.out.println(name.concat(" Tendulkar"));
		name=name.concat("Tendulkar");
		System.out.println(name);
		
	}

}
