package chapter2.observer.java_observable;

import java.util.Observable;

public class WeatherData extends Observable{

	private float temperature;
	private float humidity;
	float pressure;
	
	public WeatherData() {
	}
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasutmments(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	
}
