package chapter4.factorypattern.p3_abstract_factory_pattern;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		PizzaIngredientFactory integratedFactory = 
				new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")) {

			pizza = new CheesePizza(integratedFactory);
			pizza.setName("New York Style Cheese Pizza");
			
		}else if(type.equals("pepperoni")) {

			pizza = new PepperoniPizza(integratedFactory);
			pizza.setName("New York Style Cheese Pizza");
			
		}else if(type.equals("clam")) {

			pizza = new ClamPizza(integratedFactory);
			pizza.setName("New York Style Cheese Pizza");
			
		}else if (type.equals("veggie")){

			pizza = new VeggiePizza(integratedFactory);
			pizza.setName("New York Style Cheese Pizza");
			
		}

		return pizza;
	}

}
