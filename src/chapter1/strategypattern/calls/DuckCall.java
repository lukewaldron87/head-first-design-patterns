package chapter1.strategypattern.calls;

import chapter1.strategypattern.behavior.Quack;
import chapter1.strategypattern.behavior.QuackBehavior;

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
