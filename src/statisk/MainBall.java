package statisk;

public class MainBall {

	public static void main(String[] args) {
		Ball ball1 = new Ball();
		Ball ball2 = new Ball();
		Ball ball3 = new Ball();
		Ball ball4 = new Ball();
		Ball ball5 = new Ball();
		
		//Skriver ut fargen
		System.out.println(ball1.getFarge());
		//Setter fargen til ballen lik rød
		ball1.setFarge("Red");
		//Skriver ut fargen 
		System.out.println(ball1.getFarge());
		//Skrive ut ArrayList
		System.out.println(Ball.ballListe);
	}

}
