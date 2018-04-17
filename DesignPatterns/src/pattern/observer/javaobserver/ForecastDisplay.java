package pattern.observer.javaobserver;

import java.util.Observable;
import java.util.Observer;

import pattern.observer.weatherapp.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {

	Observable observable;
	private float currentPressure;
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (currentPressure > lastPressure) {
			System.out.println("Forecast: Weather is improving");
		} else {
			System.out.println("Forecast: Weather is getting worse");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			
			display();
		}
	}

}
