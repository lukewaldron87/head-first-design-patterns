package chapter1.strategypattern.ducks;

import chapter1.strategypattern.behavior.FlyWithWings;
import chapter1.strategypattern.behavior.Quack;
import chapter1.strategypattern.behavior.QuackBehavior;

public class ReadheadDuck extends Duck{

	public ReadheadDuck() {
		super.flyBehavior = new FlyWithWings();
		super.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Redhead Duck");
	}

}
