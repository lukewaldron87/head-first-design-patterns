package chapter2.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index >= 0) {
			observers.remove(index);
		}
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer: observers){
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementChanged() {
		notifyObservers();
	}
	
	public void setMeasutmments(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}
