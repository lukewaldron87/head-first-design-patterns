package chapter2.observer.java_observable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float currentPresaure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			lastPressure = currentPresaure;
			currentPresaure = weatherData.getPressure();
			display();
		}
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
