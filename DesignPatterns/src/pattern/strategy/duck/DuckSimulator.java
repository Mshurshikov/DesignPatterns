package pattern.strategy.duck;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		model.setFlyingBehavior(new FlyWithWings());
		model.setQuackBehavior(new Squeak());

		model.performFly();
		model.performQuack();
	}

}
