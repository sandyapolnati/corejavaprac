package exceptionprac;

public class ThrowExample {

	public static void main(String[] args) {

//		validateAgeForVote
		
		//validateAgeForVote(10);
		validateAgeForVote(45);

	}

	static void validateAgeForVote(int age) {
		if (age < 0) {
			//System.out.println("Age is lessthan ZERO");
//			return;
			
			throw new RuntimeException("Age is lessthan ZERO");
		}

		if (age < 18) {
			System.out.println("Not eligible for vote");
		} else {
			System.out.println("eligible for vote");
		}
	}

}
