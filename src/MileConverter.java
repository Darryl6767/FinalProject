public class MileConverter {
    private double mile2; // stores the converted value of miles
    private double km2; // stores the converted value of kilometers

    // converts miles to kilometers
    public double convertMtoKm(double mile){
        km2 = mile * 1.609;
        return km2;
    }

    // converts kilometers to miles
    public double convertKmtoM(double km){
        mile2 = km/1.609;
        return mile2;
    }
}
