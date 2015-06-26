package weather_station;

import weather_station.interfaces.DisplayElement;
import weather_station.interfaces.Observer;
import weather_station.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement
{
	private float temperature;
	private float humidity;

	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display()
	{
		System.out.println(temperature + humidity);
	}

	@Override
	public void update(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
