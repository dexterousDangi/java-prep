package Reflection.basic.inJava;

public class Dog {

	private String name;
	private int age;
	public Dog() {
		this.setAge(3);
		this.setName("mugal");
	}
	public Dog(String name,int age) {
		this.setName(name);
		this.setAge(age);
		
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
}
