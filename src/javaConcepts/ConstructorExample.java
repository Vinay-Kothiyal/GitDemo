package javaConcepts;

class ConstructorExample {
	String y;
	int q;

	ConstructorExample() {
		System.out.println("Java is easy");
	}

	ConstructorExample(String y) {
		System.out.println(y);
	}
	

	ConstructorExample(String y, int q) {
		System.out.println(y+" "+q);
	}
}

