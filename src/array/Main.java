package array;

import java.util.ArrayList;

import person.PrivatePerson;

public class Main {

	public static void main(String[] args) {

		//Declare a new variable of type ArrayList<PrivatePerson>, then instantiate and initialize it.
		ArrayList<PrivatePerson> personList = new ArrayList<>();
		
		//Create and add objects and add then to the arrayList
		PrivatePerson nico = new PrivatePerson("Nicolai", "Naglestad", 24);
		personList.add(nico);
		PrivatePerson berzi = new PrivatePerson("Berzi", "Wasfy", 24);
		personList.add(berzi);
		
		//Generate more random people and add them to the list
		//This is a standard boring for loop
		for (int i = 0; i < 10; i++) {
			PrivatePerson person = new PrivatePerson("Person" + i, "Lastname" + i, 18 + i);
			personList.add(person);
		}
		
		
		//Now lets have everyone in the list say hi using a foreach loop
		for (PrivatePerson p : personList) {
			p.sayHi();
			System.out.println();
		}

	}

}
