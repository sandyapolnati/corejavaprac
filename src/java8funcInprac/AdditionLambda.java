package java8funcInprac;

public class AdditionLambda {

	public static void main(String[] args) {

		
		IAddition iaddition = ( a,  b) -> {
			System.out.println("add method()");
			 return a+b;
		};
		
		
		System.out.println(iaddition.add(3, 6));
	}
}
