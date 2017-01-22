package lecture1;

//Start of the class
public class CoolClass {
	
	//Global class variables
	private int aRandomNumber;
	private String aRandomName;
	
	//Class constructor
	public CoolClass(int aRandomNumber, String aRandomName) {
		this.aRandomNumber = aRandomNumber;
		this.aRandomName = aRandomName;
	}

	//Getters and setters
	public int getaRandomNumber() {
		return aRandomNumber;
	}

	public void setaRandomNumber(int aRandomNumber) {
		this.aRandomNumber = aRandomNumber;
	}

	public String getaRandomName() {
		return aRandomName;
	}

	public void setaRandomName(String aRandomName) {
		this.aRandomName = aRandomName;
	}
	
}
