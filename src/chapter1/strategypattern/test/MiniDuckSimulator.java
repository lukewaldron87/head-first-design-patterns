package chapter1.strategypattern.test;

import chapter1.strategypattern.behavior.FlyRocketPowered;
import chapter1.strategypattern.calls.DuckCall;
import chapter1.strategypattern.ducks.Duck;
import chapter1.strategypattern.ducks.MallardDuck;
import chapter1.strategypattern.ducks.ModelDuck;
import chapter1.strategypattern.ducks.ReadheadDuck;
import chapter1.strategypattern.ducks.RubberDuck;

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
