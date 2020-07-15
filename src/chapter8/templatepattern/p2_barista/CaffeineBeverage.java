package chapter8.templatepattern.p2_barista;

public abstract class CaffeineBeverage {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondements();
	}

	abstract void brew();

	abstract void addCondements();

	void boilWater() {
		System.out.println("Boiling Water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

}
