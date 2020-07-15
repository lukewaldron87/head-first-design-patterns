package chapter4.factorypattern.p2_factory_method_pattern;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crush Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
