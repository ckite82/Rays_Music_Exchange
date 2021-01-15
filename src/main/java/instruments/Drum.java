package instruments;

public class Drum extends Instrument{

    private int numberOfDrums;
    //    TODO: Not used String type from sub-class in plan Chris!

    public Drum (String type, String material, String colour, double sellingPrice, double buyingPrice){
        super (type, material, colour, sellingPrice, buyingPrice);
        this.numberOfDrums = numberOfDrums;
    }
}
