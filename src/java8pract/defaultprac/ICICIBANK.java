package java8pract.defaultprac;

public class ICICIBANK implements IBank{

	@Override
	public void withDraw(float amount, String withDrawAccountNumber) { // Implemention
		
		System.out.println(" ICICI Withdrew amout ");
	}

	@Override
	public void deposit(float amount, String depostAccountNumber) {
		System.out.println(" ICICI Deposit amout ");
		
	}

}
