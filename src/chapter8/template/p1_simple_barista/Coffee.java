package chapter8.template.p1_simple_barista;

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
