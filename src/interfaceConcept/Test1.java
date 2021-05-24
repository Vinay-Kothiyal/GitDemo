package interfaceConcept;

public class Test1 implements Drawable, Volume {

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		System.out.println("volme");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw");
	}
  public static void main(String[] args) {
	  int t=2;
	  Test1 vol = new Test1();
	  vol.draw();
	  vol.volume();
	  System.out.println(t);
}	
}
