package parents;

public class Car extends Vehicle {

	private int maxPassengers;

	public Car(String make, String model, int year, int maxPassengers) {
		super(make, model, year);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	@Override
	public String toString() {
		return super.toString() + " can carry up to " + maxPassengers + " people";
	}

}
