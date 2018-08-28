package qa.com.rest.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherReport {

	@JsonProperty("City")
	private String city;
	
	@JsonProperty("Temperature")
	private String temperature;
	
	@JsonProperty("Humidity")
	private String humidity;
	
	@JsonProperty("WeatherDescription")
	private String weatherDescription;
	
	@JsonProperty("WindSpeed")
	private String windSpeed;
	
	@JsonProperty("WindDirectionDegree")
	private String windDirectionDegree;

	public WeatherReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return city + "-- WeatherReport \n city=" + city + ",\n temperature=" + temperature + ",\n humidity=" + humidity
				+ ",\n weatherDescription=" + weatherDescription + ",\n windSpeed=" + windSpeed + ",\n windDirectionDegree="
				+ windDirectionDegree;
	}

	public WeatherReport(String city, String temperature, String humidity, String weatherDescription, String windSpeed,
			String windDirectionDegree) {
		super();
		this.city = city;
		this.temperature = temperature;
		this.humidity = humidity;
		this.weatherDescription = weatherDescription;
		this.windSpeed = windSpeed;
		this.windDirectionDegree = windDirectionDegree;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getWeatherDescription() {
		return weatherDescription;
	}

	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWindDirectionDegree() {
		return windDirectionDegree;
	}

	public void setWindDirectionDegree(String windDirectionDegree) {
		this.windDirectionDegree = windDirectionDegree;
	}

	

	}
