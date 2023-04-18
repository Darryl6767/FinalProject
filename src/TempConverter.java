public class TempConverter {
    private double fahrenheit2;

    //private double fahrenheit2;
    private double celsius;

    public double convertCtoF(double celsius) {
        fahrenheit2 = (celsius * 1.8) + 32;
        return fahrenheit2;
    }

    public double convertFtoC(double fahrenheit) {

        celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
}
