package javaConcepts;

 class finalClass1 {
 final int a=1;
 
 final void m1() {
	// a=2;
	 System.out.println("m1");
 }
 
}

public class finalClass extends finalClass1 {
	
//	void m1() {
//		System.out.println("override m1");
//		
//	}
	
	public static void main(String[] args) {
		finalClass1 m= new finalClass1();
		m.m1();
	}
	
}
