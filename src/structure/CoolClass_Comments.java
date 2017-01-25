package structure;

import java.util.ArrayList;

public class CoolClass_Comments {
	
	//Global class variables
		//Static variables
	private static ArrayList<CoolClass_Comments> coolClassList = new ArrayList<>();
	
		//public/private/protected variables
	private int aRandomNumber;
	private String aRandomName;
	
		//Final variables
	private final String LAST_WORDS = "Goodbye World!";
	
	
	//Class constructor
	public CoolClass_Comments(int aRandomNumber, String aRandomName) {
		this.aRandomNumber = aRandomNumber;
		this.aRandomName = aRandomName;
	}

	
	//Methods
	public void aRandomMethod() {
		System.out.println(LAST_WORDS);
	}

	
	//Getters and setters
	public static ArrayList<CoolClass_Comments> getCoolClassList() {
		return coolClassList;
	}

	public static void setCoolClassList(ArrayList<CoolClass_Comments> coolClassList) {
		CoolClass_Comments.coolClassList = coolClassList;
	}

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

	public String getLAST_WORDS() {
		return LAST_WORDS;
	}

}

