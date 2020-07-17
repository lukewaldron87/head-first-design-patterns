package chapter1.strategy.calls;

import chapter1.strategy.behavior.Quack;
import chapter1.strategy.behavior.QuackBehavior;

public class DuckCall {

	private QuackBehavior quackBehavior;
	
	public DuckCall() {
		this.quackBehavior = new Quack();
	}
	
	public void makeCallSound() {
		quackBehavior.quack();
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
