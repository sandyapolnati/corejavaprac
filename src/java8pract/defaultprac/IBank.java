package java8pract.defaultprac;

public interface IBank { // Specification -> Has to follow all implemented classes
	 
	void withDraw(float amount, String withDrawAccountNumber); // Method declaration
	void deposit(float amount, String depostAccountNumber); // Abstarct method 
	 
	default void rateOfIntrest(int percentage) {
		System.out.println("Default ROI");
	}

}
