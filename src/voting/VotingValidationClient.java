package voting;

public class VotingValidationClient {

	// Ctrl + shift + F -> format the clss
	public static void main(String[] args) {

		Person p1 = new Person(); // class ref = new class();
		p1.setId(1);
		p1.setName("Jack");
		p1.setAge(22);
		p1.setVoterId(true);

		Person p2 = new Person(); // class ref = new class();
		p2.setId(1);
		p2.setName("Jill");
		p2.setAge(12);
		p2.setVoterId(false);

		Person p3 = new Person(); // class ref = new class();
		p3.setId(1);
		p3.setName("rose");
		p3.setAge(42);
		p3.setVoterId(false);

		VotingValidationClient obj = new VotingValidationClient();
		obj.validVoting(p1); // calle 
		obj.validVoting(p2);
		obj.validVoting(p3);
	}

	 void validVoting(Person p) { // caller 
		if (p.getAge() >= 18 && p.isVoterId()) {
			System.out.println(p.getName() + " is Eligible for vote");

		} else {
			System.out.println(p.getName() + " is not Eligible for vote");
		}

	}
	 

}
