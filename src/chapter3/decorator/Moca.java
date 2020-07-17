package chapter3.decorator;

public class Moca extends CondimentDecorator {
	
	Beverage beverage;
	
	public Moca(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Moca";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
