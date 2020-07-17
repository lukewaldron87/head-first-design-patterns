package chapter3.decorator.with_size;

public class Decaf extends Beverage {
	
	public Decaf() {
		description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}
