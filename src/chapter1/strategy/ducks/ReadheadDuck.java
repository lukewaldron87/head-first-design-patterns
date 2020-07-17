package chapter1.strategy.ducks;

import chapter1.strategy.behavior.FlyWithWings;
import chapter1.strategy.behavior.Quack;

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
