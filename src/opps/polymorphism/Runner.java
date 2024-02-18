package opps.polymorphism;

class Poly {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;

	}
}

public class Runner {
	public static void main(String args[]) {
		Poly p = new Poly();
		System.out.println(p.add(1, 2));
		System.out.println(p.add(1, 2, 3));
	}
}
