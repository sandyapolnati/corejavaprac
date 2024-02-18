package voting;

public class Person { // Rigth click + Source + generate gettres and setters

	private int id;
	private String name;
	private int age;
	private boolean voterId; // Data

	public int getId() { // Behaviour => Data + Behaviour -> class (Encapuslation)
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isVoterId() {
		return voterId;
	}

	public void setVoterId(boolean voterId) {
		this.voterId = voterId;
	}

}
