package chapter4.factory.p3_abstract_factory_pattern;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		/*if(type.equals("cheese")) {
			return new CaliforniaStyleCheesePizza();
		}else if(type.equals("pepperoni")) {
			return new CaliforniaStylePepperoniPizza();
		}else if(type.equals("clam")) {
			return new CaliforniaStyleClamPizza();
		}else if (type.equals("veggie")){
			return new CaliforniaStyleVeggiePizza();
		}else {*/
			return null;
		//}
	}

}
