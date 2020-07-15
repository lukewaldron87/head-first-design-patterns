package chapter2.observerpattern;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPresaure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPresaure;
		currentPresaure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if(currentPresaure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPresaure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPresaure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
