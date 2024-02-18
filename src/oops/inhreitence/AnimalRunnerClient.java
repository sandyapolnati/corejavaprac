package oops.inhreitence;

public class AnimalRunnerClient {
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.setBreed("Bredd 1");
		
		System.out.println(c);
		
		c.speak();
		
	}

}
