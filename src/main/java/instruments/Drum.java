package instruments;

public class Drum extends Instrument{

    private int numberOfDrums;
//    String type; there is a type in the
    public Drum (String type, String material, String colour, double sellingPrice, double buyingPrice){
        super (type, material, colour, sellingPrice, buyingPrice);
        this.numberOfDrums = numberOfDrums;
    }
}
