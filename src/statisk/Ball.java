package statisk;

import java.util.ArrayList;

public class Ball {
	public Integer id;
	public static int teller;
	public static ArrayList<Ball> ballListe = new ArrayList<>();
	private String farge;

	public Ball() {
		teller++;
		id = teller;
		System.out.println("Jeg er en ball og heter " + id);
		ballListe.add(this);
	
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}


	
	

}
