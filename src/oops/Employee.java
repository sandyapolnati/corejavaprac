package oops;

public class Employee {
	
	// State + Behaviour = class (Encapuslation) - data should be private 

	private int id;
	private String name;
	private String desg;
	private int age;
	private String address; // State

	public int getId() {
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

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new RuntimeException("Age can't be negative");
		}
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", age=" + age + ", address=" + address
				+ "]";
	}

}

// procedure oop 

// oop