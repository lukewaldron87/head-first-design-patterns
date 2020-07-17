package chapter8.template.p2_barista;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondements() {
		System.out.println("Adding Lemon");
	}

}
