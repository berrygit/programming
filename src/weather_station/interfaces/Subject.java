package weather_station.interfaces;

public interface Subject
{

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();
}
