package weather_station.interfaces;

public interface Observer
{
	void update(float temperature, float humidity, float pressure);
}
