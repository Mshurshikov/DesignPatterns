package pattern.strategy.duck;

public class Mute implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<Silence>");
	}

}
