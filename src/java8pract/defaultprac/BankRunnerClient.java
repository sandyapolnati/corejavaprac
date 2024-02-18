package java8pract.defaultprac;

public class BankRunnerClient {

	public static void main(String[] args) {

//		IBank b = new IBank();

		// Dynamic polymorpism

		IBank hdfcBank = new HDFCBank();

		hdfcBank.deposit(10, "5365365363");
		hdfcBank.rateOfIntrest(3);

		IBank icici = new ICICIBANK();

		icici.deposit(101, "15365365363");

		IBank sbi = new SBI();

		sbi.deposit(201, "05365365363");
		sbi.rateOfIntrest(3);
		
//		IBank bankObj = null;
//		
//		String input = Scanner ;
//		if(input == hdfc)
//		{
//			bankObj = new HDFCBank();
//		}else if (input sbi)
//		{
//			bankObj = new SBI();
//		}
//		
//		bankObj.deposit(amount, depostAccountNumber);
	}

}
