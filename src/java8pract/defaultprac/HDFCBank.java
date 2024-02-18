package java8pract.defaultprac;

public class HDFCBank implements IBank{

	@Override
	public void withDraw(float amount, String withDrawAccountNumber) { // Implemention
		
		System.out.println(" HDFC BANK Withdrew amout ");
	}

	@Override
	public void deposit(float amount, String depostAccountNumber) {
		System.out.println(" HDFC BANK Deposit amout ");
		
	}
	
	@Override
	public void rateOfIntrest(int percentage)
	{
		System.out.println("HDFC ROI");
	}

}
