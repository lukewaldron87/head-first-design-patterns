package chapter1.strategypattern.ducks;

import chapter1.strategypattern.behavior.FlyNoWay;
import chapter1.strategypattern.behavior.Quack;

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
