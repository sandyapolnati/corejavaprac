package svoting;

// PascalCase - classes - HelloWorld
// camelCase - methods - areYouEligibleForVoting()
public class SvotingValidationclient {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setId(1);
		p1.setAge(18);
		p1.setName("sandhya");
		p1.setVoterid(true);

		Person p2 = new Person();
		p2.setId(2);
		p2.setAge(9);
		p2.setName("bobby");
		p2.setVoterid(false);

		Person p3 = new Person();
		p3.setId(3);
		p3.setAge(19);
		p3.setName("haswi");
		p3.setVoterid(true);

		votingValid(p1);
		votingValid(p2);
		votingValid(p3);
	}

	static void votingValid(Person p) {
		if (p.getAge() >= 18 && p.isVoterid()) {
			System.out.println(p.getName() + "is eligble for vote");
		} else {
			System.out.println(p.getName() + "is not eligible for vote");

		}
	}
}
