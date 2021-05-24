package interfaceConcept;

public class Test {
	
	public static void main(String[] args) {
		Drawable d= new Square();
		d.draw();
		System.out.println(d.t);
		Rectangle l= new Rectangle();
		System.out.println(l.t);
	}

}
