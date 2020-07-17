package chapter3.decorator.with_size;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
