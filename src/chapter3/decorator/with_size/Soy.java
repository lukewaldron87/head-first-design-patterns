package chapter3.decorator.with_size;

public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		
		Size size = beverage.getSize();
		double soyCost = beverage.cost() ;
		switch(size) {
			case TALL: soyCost += 0.10;
			break;
			case GRANDE: soyCost += 0.15;
			break;
			case VENTI: soyCost += 0.20;
			break;
		}
		return soyCost;
	}

}
