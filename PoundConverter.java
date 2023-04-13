public class PoundConverter {
    private double pounds2;
    private double kg2;

    public double convertPoundstoKg(double pounds){
        kg2 = pounds/ 2.205;
        return kg2;
    }
    public double convertKgtoPounds(double kg){
        pounds2 = kg * 2.205;
        return pounds2;
    }
}
