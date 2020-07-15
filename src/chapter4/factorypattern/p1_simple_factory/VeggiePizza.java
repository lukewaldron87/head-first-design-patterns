package chapter4.factorypattern.p1_simple_factory;

public class VeggiePizza extends Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparing a Veggie Pizza");
	}

}
