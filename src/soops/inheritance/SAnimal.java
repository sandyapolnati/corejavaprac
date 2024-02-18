package soops.inheritance;

public class SAnimal {
	
	private String breed;
	private String name;
	private  double weight;
	private double height;
	private String speek;
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getSpeek() {
		return speek;
	}
	public void setSpeek(String speek) {
		this.speek = speek;
	}
	@Override
	public String toString() {
		return "SAnimal [breed=" + breed + ", name=" + name + ", weight=" + weight + ", height=" + height + ", speek="
				+ speek + "]";
	}
	
	


}
