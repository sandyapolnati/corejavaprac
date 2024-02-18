package exceptionprac;

public class ExceptionDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		division(a, b);

		System.out.println("Code execution complted");

	}

	static void division(int a, int b) {

		try {
			int c = a / b;
			System.out.println(" After divide value is :" + c);
		} catch (Exception e) {
			System.out.println(" Can't didvide with zero");
		} finally {
			System.out.println("finally block ()s");
		}
	}
}
