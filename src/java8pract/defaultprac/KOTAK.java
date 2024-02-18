package java8pract.defaultprac;

public class KOTAK implements IBank{

	@Override
	public void withDraw(float amount, String withDrawAccountNumber) { // Implemention
		
		System.out.println(" KOTAK Withdrew amout ");
	}

	@Override
	public void deposit(float amount, String depostAccountNumber) {
		System.out.println(" KOTAK Deposit amout ");
		
	}

}
