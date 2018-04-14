package pattern.observer.javaobserver;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
	}
	
	public void measurementsChanged() {
		
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		
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
