package chapter4.factorypattern.p1_simple_factory;

public class ClamPizza extends Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparing a Clam Pizza");
	}

}
