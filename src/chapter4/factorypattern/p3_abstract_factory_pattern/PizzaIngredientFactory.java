package chapter4.factorypattern.p3_abstract_factory_pattern;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
