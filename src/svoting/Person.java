package svoting;
class Person
{
	private int id;
	private int age;
	private String name;
	private boolean voterid; // data / state 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVoterid() {
		return voterid;
	}
	public void setVoterid(boolean voterid) {
		this.voterid = voterid;
	}
}