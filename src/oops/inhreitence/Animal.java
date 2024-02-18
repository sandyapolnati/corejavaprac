package oops.inhreitence;

public class Animal {

	private String color;
	private String breed;
	private double height;
	private double weight;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [color=" + color + ", breed=" + breed + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
