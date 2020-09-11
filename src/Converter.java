public class Converter {
	// This the the development branch
	//Your names go here:
	/*
	 * @Author: Evan Boerchers, Chetana Bijoor, Karlen Chow
	 */

	private double celsiusToFahrenheit(double C) {
		return (C * (9 / 5)) + 32;
	}

	private double fahrenheitToCelsius(double F) {
		return ((F - 32) * 5) / 9;

	}

	public static void main(String[] args) {

		Converter con = new Converter();

// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
		System.out.println(con.celsiusToFahrenheit(180));

// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
		System.out.println(con.fahrenheitToCelsius(250));

	}

}
