package day09_面向对象综合;

public class GirlFriend {
	private String name;
	private int age;
	private char gender;
	private String hobby;
	public GirlFriend() {
		super();
	}
	public GirlFriend(String name, int age, char gender, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
