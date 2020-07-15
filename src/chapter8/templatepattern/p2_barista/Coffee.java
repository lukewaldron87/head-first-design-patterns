package chapter8.templatepattern.p2_barista;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondements() {
		System.out.println("Adding Sugar and Milk");
	}

}
