package weather_station.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import weather_station.interfaces.Observer;
import weather_station.interfaces.Subject;

public class WeatherData implements Subject
{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData()
	{
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o)
	{
		int i = observers.indexOf(o);
		if (i >= 0)
		{
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver()
	{
		for (int i = 0; i < observers.size(); i++)
		{
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

}
