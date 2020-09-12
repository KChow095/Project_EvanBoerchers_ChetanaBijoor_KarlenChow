public class Converter {
	// This is the development branch
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
	
	public double kilometresToMiles(double K){
	    return (K/1.609);
	  }

	public static void main(String[] args) {

		Converter con = new Converter();

// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
		double C = 180;
		System.out.println(C + " celsius is " + con.celsiusToFahrenheit(C) + " fahrenheit");

// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
		double F = 250;
		System.out.println(F + " fahrenheit is " + con.fahrenheitToCelsius(F) + " celcius");
		
// Kilometer to mile test for 30 kilometers.
		double km = 30;
		System.out.println(km + " kilometers is " + con.kilometresToMiles(km) + " miles");
		
	}

}
