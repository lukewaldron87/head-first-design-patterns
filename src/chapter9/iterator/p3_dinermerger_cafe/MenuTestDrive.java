package chapter9.iterator.p3_dinermerger_cafe;

public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		waitress.printMenue();
	}

}
