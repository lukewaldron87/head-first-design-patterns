package chapter4.factorypattern.p3_abstract_factory_pattern;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = 
				new ChicagoPizzaIngredientFactory();
		
		if(type.equals("cheese")) {
			
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Cheese Pizzza");
			
		}else if(type.equals("pepperoni")) {
			
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizzza");
			
		}else if(type.equals("clam")) {
			
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Clam Pizzza");
			
		}else if (type.equals("veggie")){
			
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Veggie Pizzza");
			
		}
		
		return pizza;
	}

}
