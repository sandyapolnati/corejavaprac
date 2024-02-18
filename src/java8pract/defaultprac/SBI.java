package java8pract.defaultprac;

public class SBI implements IBank{

	@Override
	public void withDraw(float amount, String withDrawAccountNumber) { // Implemention
		
		System.out.println(" SBI Withdrew amout ");
	}

	@Override
	public void deposit(float amount, String depostAccountNumber) {
		System.out.println(" SBI Deposit amout ");
		
	}

}
