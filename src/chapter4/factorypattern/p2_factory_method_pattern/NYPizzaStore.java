package chapter4.factorypattern.p2_factory_method_pattern;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}else if(type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		}else if(type.equals("clam")) {
			return new NYStyleClamPizza();
		}else if (type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else {
			return null;
		}
		
	}

}
