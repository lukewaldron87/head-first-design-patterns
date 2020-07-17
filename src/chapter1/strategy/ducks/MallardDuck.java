package chapter1.strategy.ducks;

import chapter1.strategy.behavior.FlyWithWings;
import chapter1.strategy.behavior.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		super.flyBehavior = new FlyWithWings();
		super.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
