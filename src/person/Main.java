package person;

public class Main {

	public static void main(String[] args) {
		
		//Declare a new variable of type Person, then instantiate and initialize it using its constructor.
		Person nico = new Person("Nicolai", "Naglestad", 24);
		
		//Run the variable nico's sayHi() method.
		nico.sayHi();
		
		//Set nico's internal variable to a new value.
		//This is possible due to the variable being public.
		nico.firstName = "Berzi";
		
		nico.sayHi();
		
		System.out.println("--------------------");
		
		//Declare a new variable of type PrivatePerson, then instantiate and initialize it using its constructor.
		PrivatePerson berzi = new PrivatePerson("Berzi", "Wasfy", 24);
		
		berzi.sayHi();
		
		//Change berzi lastName variable using its setter
		//Due to the variable being private it can not be accessed directly
		berzi.setLastName("Naglestad");
		
		berzi.sayHi();
		
		System.out.println("--------------------");

		
		//Print out the name of the objects either directly (Person class) or via getters 
		System.out.println(nico.firstName + " " + nico.lastName);
		System.out.println(berzi.getFirstName() + " " + berzi.getLastName());
		
	}

}
