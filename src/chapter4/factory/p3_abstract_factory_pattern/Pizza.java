package chapter4.factory.p3_abstract_factory_pattern;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(name + ": ");
		
		if(dough != null) {
			stringBuilder.append(dough.toString()+" ");
		}
		
		if(sauce != null) {
			stringBuilder.append(sauce.toString()+" ");
		}
		
		if(veggies != null) {
			stringBuilder.append(createVeggieString()+" ");
		}
		
		if(cheese != null) {
			stringBuilder.append(cheese.toString()+" ");
		}
		
		if(pepperoni != null) {
			stringBuilder.append(pepperoni.toString()+" ");
		}
		
		if(clam != null) {
			stringBuilder.append(clam.toString()+" ");
		}
		
		return stringBuilder.toString();
		
		
	}
	
	private String createVeggieString() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Veggies veggie: veggies) {
			stringBuilder.append(veggie.toString()+" ");
		}
		return stringBuilder.toString();
	}
	
}
