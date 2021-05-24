package javaConcepts;

public class InheritanceMain extends InheritanceExample {
	String name;
	void setname(String b) {
		name= b;
	}
	void studentname() {
		System.out.println("Student name= "+name);
	}
	
	
	public static void main(String[] args) {
		InheritanceMain m= new InheritanceMain() ;
		m.setname("Rakul");
		m.studentname();
		m.age=3;
		m.studentage();
		System.out.println("Age: "+m.age+" Name: "+m.name);	
		}
	}


