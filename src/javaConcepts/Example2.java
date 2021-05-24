package javaConcepts;

public class Example2 {
int age;
String name;
void studentage(int n) {
	age=n;
	System.out.println("Age is: "+age);
}
void studentname(String b ) {
	name=b;
	System.out.println("Name is: "+name);
}
void combine(int n, String b) {
	age=n;
	name=b;
	System.out.println("Student name is "+name+" and age is "+age);
	
}
void studentname(String b, int n ) {
	name=b;
	age=n;
	System.out.println("Student name is "+name+" and age is "+age);
}
void studentname(int age, String name ) {
	this.name=name;
	this.age=age;
	System.out.println("Student name is "+name+" and age is "+age);
}
public static void main(String[] args) {
	Example2 q= new Example2();
	q.studentage(10);
	q.studentname("Rahul");
	q.combine(12, "Rohit");
	q.studentname("Sheetal", 15);
    q.studentname(16, "Renu");
}

}
