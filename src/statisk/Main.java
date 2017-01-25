package statisk;

public class Main {

	public static void main() {
		Ball ball = new Ball();
		new Ball();
		new Ball();
		new Ball();
		new Ball();
		
		
		System.out.println(Ball.ballListe);
		
		System.out.println(ball.getFarge());
		
		ball.setFarge("Red");
		
		System.out.println(ball.getFarge());
	}

}
