package chapter1.strategy.ducks;

import chapter1.strategy.behavior.FlyNoWay;
import chapter1.strategy.behavior.MuteQuack;

public class RubberDuck extends Duck{

	public RubberDuck() {
		super.flyBehavior = new FlyNoWay();
		super.quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Rubber Duck");
	}

}
