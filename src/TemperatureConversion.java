import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        //Creating scanner for input from user
        Scanner input = new Scanner(System.in);
        //Creating variables to keep track of temperature types
        double tempFahrenheit = 0;
        double tempCelsius = 0;
        double tempKelvin = 0;
        //Asking user for temperature -output to screen
        System.out.println("Enter temperature in Fahrenheit: ");
        //Setting input from user to temperature in Fahrenheit variable
        tempFahrenheit = input.nextDouble();
        //Conversion calculations
        tempCelsius = (((tempFahrenheit - 32.0) * 5.0) / 9.0);
        tempKelvin = tempCelsius + 273.15;
        //Output to screen temperature in Celsius & Kelvin
        System.out.println("Temperature in Celsius : " + tempCelsius);
        System.out.println("Temperature in Kelvin: " + tempKelvin);
    }
}
