package exceptionprac;

public class ThrowsExample {

	public static void main(String[] args) {

		ThrowsExample te = new ThrowsExample();

		try {

			int result = te.division(10, 0);
			System.out.println(result);
		} catch (RuntimeException e) {
			System.out.println("Exception");
		}
	}

	int division(int a, int b) throws RuntimeException {
		int c = a / b;
		return c;
	}

}
