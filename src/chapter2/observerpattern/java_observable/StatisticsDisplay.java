package chapter2.observerpattern.java_observable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement{

	private Observable observable;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obesrvable, Object arg) {

		if(obesrvable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obesrvable;
			float temperature = weatherData.getTemperature();
			tempSum += temperature;
			numReadings++;

			if(temperature > maxTemp) {
				maxTemp = temperature;
			}

			if(temperature < minTemp) {
				minTemp = temperature;
			}

			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

}
