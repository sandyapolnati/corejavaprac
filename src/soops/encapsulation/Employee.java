package soops.encapsulation;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private String salary;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ "+"\n"+"id=" + id + "\n" +", name=" + name + "\n"+", designation=" + designation + "\n"+", salary=" + salary + "]";
	}
	
	
	
	

}
