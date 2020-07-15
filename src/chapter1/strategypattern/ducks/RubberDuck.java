package chapter1.strategypattern.ducks;

import chapter1.strategypattern.behavior.FlyNoWay;
import chapter1.strategypattern.behavior.MuteQuack;

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
