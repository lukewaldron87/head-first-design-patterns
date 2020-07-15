package chapter5.singletonpattern.p1_chocolate;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler chocolateBoiler;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static synchronized ChocolateBoiler getInstance() {
		if(chocolateBoiler == null) {
			chocolateBoiler = new ChocolateBoiler();
		}
		return chocolateBoiler;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("fill the boiler with milk/chocolate");
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			System.out.println("drain the boiled milk and chocolate mixture");
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			System.out.println("bring the contents to a boil");
			boiled = true;
		}
	}

	private boolean isEmpty() {
		return empty;
	}

	private boolean isBoiled() {
		return boiled;
	}

}
