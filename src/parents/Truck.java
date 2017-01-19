package parents;

public class Truck extends Vehicle {

	private int maxLoad;

	public Truck(String make, String model, int year, int maxLoad) {
		super(make, model, year);
		this.maxLoad = maxLoad;
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}
	
	@Override
	public String toString() {
		return super.toString() + " can carry up to " + maxLoad + " tonnes";
	}
}
