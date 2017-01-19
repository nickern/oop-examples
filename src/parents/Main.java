package parents;

public class Main {

	public static void main(String[] args) {
		
		//Create 2 vehicles
		Car volvo = new Car("Volvo", "XC70", 2015, 5);
		Truck merc = new Truck("Mercedes-Benz", "Actros", 2012, 18);
		
		System.out.println(volvo);
		System.out.println(merc);
		
		System.out.println();
		
		System.out.println(volvo.getMaxPassengers());
		System.out.println(volvo.getModel());
		
		System.out.println(merc.getMake());
		
		//This wont work as Truck only inherits the Vehicle class variables and methods
		//not the Car class.
	//	System.out.println(merc.getMaxPassengers());

	}

}
