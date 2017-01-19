package person;

public class Person {
	
	public String firstName;
	public String lastName;
	public int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	public void sayHi() {
		System.out.println("Hi! My name is " + firstName + " " + lastName);
		System.out.println("I am " + age + " years old.");
	}
	
	
	
}
