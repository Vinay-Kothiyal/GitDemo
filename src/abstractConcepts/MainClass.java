package abstractConcepts;

public class MainClass extends Ferrari {

	@Override
	void tyre() {
		// TODO Auto-generated method stub
		System.out.println("Company tyre");
	}

	@Override
	void body() {
		// TODO Auto-generated method stub
		System.out.println("Company body");
	}

	public static void main(String[] args) {
		MainClass f = new MainClass();
		f.body();
		f.tyre();

	}

}
