package structure;

import java.util.ArrayList;

public class CoolClass {
	
	private static ArrayList<CoolClass> coolClassList = new ArrayList<>();
	
	private int aRandomNumber;
	private String aRandomName;
	
	private final String LAST_WORDS = "Goodbye World!";
	
	public CoolClass(int aRandomNumber, String aRandomName) {
		this.aRandomNumber = aRandomNumber;
		this.aRandomName = aRandomName;
	}
	
	public void aRandomMethod() {
		System.out.println(LAST_WORDS);
	}

	public static ArrayList<CoolClass> getCoolClassList() {
		return coolClassList;
	}

	public static void setCoolClassList(ArrayList<CoolClass> coolClassList) {
		CoolClass.coolClassList = coolClassList;
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
