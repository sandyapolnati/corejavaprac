package java8funcInprac;

public class Addition implements IAddition{

	@Override
	public int add(int a, int b) {
		System.out.println(" print add method()");
		 return a+b;
	}

	
	public static void main(String[] args) {
		Addition Iadd  = new Addition();
		System.out.println(Iadd.add(4, 5));
	}
}
