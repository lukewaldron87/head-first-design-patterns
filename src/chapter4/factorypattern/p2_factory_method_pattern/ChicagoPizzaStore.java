package chapter4.factorypattern.p2_factory_method_pattern;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}else if(type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		}else if(type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		}else if (type.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		}else {
			return null;
		}
		
	}

}
