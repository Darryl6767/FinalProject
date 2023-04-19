public class MileConverter {

    private double mile2;
    private double km2;

    public double convertMtoKm(double mile){
        km2 = mile * 1.609;
        return km2;
    }
    public double convertKmtoM(double km){
        mile2 = km/1.609;
        return mile2;


    }
}
