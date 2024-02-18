package voting;

import java.util.ArrayList;

public class VotingValidationClient2 {

	// Ctrl + shift + F -> format the clss
	public static void main(String[] args) {

		ArrayList<Person> personList = getPersonsList();

//		for(Person p:personList)  // Enhanced for loop
//		{
//			validVoting(p);
//		}
		
		for(int i=0;i<personList.size();i++) {
			validVoting(personList.get(i));
		}
	}

	 static void validVoting(Person p) { // caller 
		if (p.getAge() >= 18 && p.isVoterId()) {
			System.out.println(p.getName() + " is Eligible for vote");

		} else {
			System.out.println(p.getName() + " is not Eligible for vote");
		}

	}
	 
	 static ArrayList<Person> getPersonsList()
	 {
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
			
			ArrayList<Person> personList = new ArrayList();
			personList.add(p1);
			personList.add(p2);
			personList.add(p3);
			
			return personList;
	 }
	 

}
