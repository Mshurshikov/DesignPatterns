package pattern.observer.weatherapp;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float minTemperature;
	private float avgTemperature;
	private float maxTemperature;

	private ArrayList<Float> temperatures;

	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);

		minTemperature = 100;
		maxTemperature = 0;

		temperatures = new ArrayList<Float>();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Min/Max/Avg Temerature: " + minTemperature + "/" + maxTemperature + "/" + avgTemperature);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		float avgTemp = 0;
		temperatures.add(temperature);
		if (temperature > maxTemperature) {
			maxTemperature = temperature;
		}
		if (temperature < minTemperature) {
			minTemperature = temperature;
		}
		for (Float temp : temperatures) {
			avgTemp += temp;
		}
		avgTemperature = avgTemp / temperatures.size();
		display();
	}

}
