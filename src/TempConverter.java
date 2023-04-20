public class TempConverter {
    private double fahrenheit2; // stores the converted value of temperature in Fahrenheit
    private double celsius; // stores the converted value of temperature in Celsius

    // converts Celsius to Fahrenheit
    public double convertCtoF(double celsius) {
        fahrenheit2 = (celsius * 1.8) + 32;
        return fahrenheit2;
    }

    // converts Fahrenheit to Celsius
    public double convertFtoC(double fahrenheit) {
        celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
}
