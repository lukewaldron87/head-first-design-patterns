package chapter3.decoratorpattern.with_size;

import chapter3.decoratorpattern.with_size.Beverage.Size;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		printOrder(beverage);

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Moca(beverage2);
		beverage2 = new Moca(beverage2);
		beverage2 = new Whip(beverage2);
		printOrder(beverage2);
		
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Moca(beverage3);
		beverage3 = new Whip(beverage3);
		printOrder(beverage3);
	}

	private static void printOrder(Beverage beverage) {
		System.out.println(beverage.getDescription()
						   + " $" + beverage.cost());
	}
}
