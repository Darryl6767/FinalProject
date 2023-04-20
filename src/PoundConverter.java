public class PoundConverter {
    private double pounds2; // stores the converted value of pounds
    private double kg2; // stores the converted value of kilograms

    // converts pounds to kilograms
    public double convertPoundstoKg(double pounds){
        kg2 = pounds/ 2.205;
        return kg2;
    }

    // converts kilograms to pounds
    public double convertKgtoPounds(double kg){
        pounds2 = kg * 2.205;
        return pounds2;
    }
}
