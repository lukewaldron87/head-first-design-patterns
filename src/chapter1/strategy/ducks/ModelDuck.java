package chapter1.strategy.ducks;

import chapter1.strategy.behavior.FlyNoWay;
import chapter1.strategy.behavior.Quack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		super.flyBehavior = new FlyNoWay();
		super.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Model duck!");
	}

}
