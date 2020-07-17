package chapter5.singleton.p1_chocolate;

public class ChocolateController {

	public static void main(String[] args) {

		ChocolateBoiler chocolateBroiler = ChocolateBoiler.getInstance();
		chocolateBroiler.fill();
		chocolateBroiler.boil();
		chocolateBroiler.drain();
		
		// will return the current instance
		ChocolateBoiler chocolateBroiler2 = ChocolateBoiler.getInstance();
	}

}
