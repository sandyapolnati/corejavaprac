package soops.encapsulation;

public class EmployeeRunner {
	
	public static void main(String args[]) {
		Employee e=new Employee();
		e.setId(10);
		e.setName("sandhya");
		e.setSalary("40000.00");
		e.setDesignation("software engieneer");
		
		
		System.out.print(e);
	}

}
