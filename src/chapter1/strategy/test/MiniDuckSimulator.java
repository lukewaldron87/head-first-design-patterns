package chapter1.strategy.test;

import chapter1.strategy.behavior.FlyRocketPowered;
import chapter1.strategy.calls.DuckCall;
import chapter1.strategy.ducks.Duck;
import chapter1.strategy.ducks.MallardDuck;
import chapter1.strategy.ducks.ModelDuck;
import chapter1.strategy.ducks.ReadheadDuck;
import chapter1.strategy.ducks.RubberDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		Duck redhead = new ReadheadDuck();
		redhead.display();
		redhead.performFly();
		redhead.performQuack();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		DuckCall duckCall = new DuckCall();
		duckCall.makeCallSound();
	}

}
