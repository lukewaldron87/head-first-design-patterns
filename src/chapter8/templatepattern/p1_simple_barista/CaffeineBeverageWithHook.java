package chapter8.templatepattern.p1_simple_barista;

public abstract class CaffeineBeverageWithHook {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondements()) {
			addCondements();
		}
	}

	abstract void brew();

	abstract void addCondements();

	void boilWater() {
		System.out.println("Boiling Water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondements() {
		return true;
	}

}
